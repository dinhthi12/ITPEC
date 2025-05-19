#include <iostream>
#include <map>
#include <vector>

template <typename T>
using isGraph = std::map<T, std::vector<T>>;

int main()
{
  isGraph<std::string> graph;

  // Add edges to the graph (undirected graph)
  graph["A"].push_back("B");
  graph["A"].push_back("C");
  graph["B"].push_back("A");
  graph["B"].push_back("D");

  // Browse and print the graph
  for (const auto &[node, neighbors] : graph)
  {
    std::cout << node << " -> ";
    for (const auto &neighbor : neighbors)
    {
      std::cout << neighbor << " ";
    }
    std::cout << "\n";
  }
  return 0;
}