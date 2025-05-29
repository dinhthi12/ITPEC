/**
 * Given a matrix of size R x C (R rows, C columns), containing integers representing heights. Return:
 * The tallest number among the shortest people in each row (called max_of_row_mins)
 * The lowest number among the tallest people in each column (called min_of_col_maxes)
 */

#include <algorithm>
#include <limits>
#include <vector>

#include "matrix/analyze_matrix.h"

std::pair<int, int> analyzeMatrix(const std::vector<std::vector<int>> &matrix)
{
  int R = matrix.size();
  int C = matrix[0].size();

  // Highest number among the lowest people in each row
  int max_of_row_mins = std::numeric_limits<int>::min();
  for (int i = 0; i < R; i++)
  {
    int row_min = *std::min_element(matrix[i].begin(), matrix[i].end());
    max_of_row_mins = std::max(max_of_row_mins, row_min);
  }

  // The lowest number among the tallest people in each column
  int min_of_col_maxes = std::numeric_limits<int>::max();
  for (int j = 0; j < C; j++)
  {
    int col_max = std::numeric_limits<int>::min();
    for (int i = 0; i < R; i++)
    {
      col_max = std::max(col_max, matrix[i][j]);
    }
    min_of_col_maxes = std::min(min_of_col_maxes, col_max);
  }
  return {max_of_row_mins, min_of_col_maxes};
}