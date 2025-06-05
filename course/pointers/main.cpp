#include <iostream>

int main()
{
  // pointers = Variable that stores a memory address of another variable sometimes it is easier to work with an address
  // & address-of operator
  // * dereference operator

  std::string name = "Hello Bro";
  std::string freePizzas[5] = {"pizza1", "pizza2", "pizza3"};

  std::string *pName = &name;
  std::string *pfreePizzas = freePizzas;

  std::cout << *pfreePizzas;
  std::cout << pName;
  return 0;
}