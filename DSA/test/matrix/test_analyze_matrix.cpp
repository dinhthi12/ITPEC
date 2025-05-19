#include <gtest/gtest.h>
#include "matrix/analyze_matrix.h"

// Test case 1: Simple matrix
TEST(AnalyzeMatrixTest, SimpleCase)
{
  std::vector<std::vector<int>> matrix = {
      {3, 1, 4},
      {5, 9, 2},
      {8, 6, 7}};

  std::pair<int, int> result = analyzeMatrix(matrix);
  EXPECT_EQ(result.first, 6);  // max of row minimums: [1, 2, 6] => max = 6
  EXPECT_EQ(result.second, 7); // min of column maximums: [8, 9, 7] => min = 7
}

// Test case 2: All elements are the same
TEST(AnalyzeMatrixTest, UniformMatrix)
{
  std::vector<std::vector<int>> matrix = {
      {2, 2},
      {2, 2}};

  std::pair<int, int> result = analyzeMatrix(matrix);
  EXPECT_EQ(result.first, 2);
  EXPECT_EQ(result.second, 2);
}

// Test case 3: One row
TEST(AnalyzeMatrixTest, OneRow)
{
  std::vector<std::vector<int>> matrix = {
      {5, 3, 7}};

  std::pair<int, int> result = analyzeMatrix(matrix);
  EXPECT_EQ(result.first, 3);  // min in only row
  EXPECT_EQ(result.second, 3); // max in each column = element itself, min = 3
}

// Test case 4: One column
TEST(AnalyzeMatrixTest, OneColumn)
{
  std::vector<std::vector<int>> matrix = {
      {1},
      {9},
      {3}};

  std::pair<int, int> result = analyzeMatrix(matrix);
  EXPECT_EQ(result.first, 9);
  EXPECT_EQ(result.second, 9);
}