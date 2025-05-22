#include <iostream>

int main()
{
  int students = 20;
  students += 1;
  int stu = students++;
  int stu2 = ++students;

  int remainder = students % 2;
  std::cout << remainder;
  std::cout << stu;
  std::cout << stu2;

  return 0;
}