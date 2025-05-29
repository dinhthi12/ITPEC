#include <iostream>

namespace A
{
  void printf()
  {
    std::cout << "Hello A\n";
  }
}

namespace B
{
  void printf()
  {
    std::cout << "Hello B";
  }
}

using namespace A;
int main()
{
  printf();
  B::printf();
  return 0;
}