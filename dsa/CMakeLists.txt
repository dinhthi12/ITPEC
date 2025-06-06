cmake_minimum_required(VERSION 3.10)
project(DSA)

# C++ standard
set(CMAKE_CXX_STANDARD 17)

# link include
include_directories(include)

# GoogleTest
add_subdirectory(lib/googletest)
include_directories(lib/googletest/googletest/include)

# Add source files
set(BIT_MANIPULATION_SRC
    src/bitManipulation/add_binary.cpp
)

set(ARRAY_SRC
    src/array/two_sum.cpp
)

set(EXERCISES_SRC
    src/exercises/list_divisors.cpp
    src/exercises/sumn.cpp
    src/exercises/sum_squares.cpp
    src/exercises/sum_series.cpp
    src/exercises/palindrome_number.cpp
    src/exercises/product_of_divisors.cpp
)

set(MATRIX_SRC
    src/matrix/analyze_matrix.cpp
)

set(HASHTABLE_SRC
    src/hashtable/roman_to_int.cpp
)

# Create lib
add_library(dsa_lib
    ${BIT_MANIPULATION_SRC}
    ${EXERCISES_SRC}
    ${ARRAY_SRC}
    ${MATRIX_SRC}
    ${HASHTABLE_SRC}
)

# Add test
# bitManipulation
add_executable(test_add_binary test/bitManipulation/test_add_binary.cpp)
target_link_libraries(test_add_binary gtest gtest_main dsa_lib)

# array
add_executable(test_two_sum test/array/test_two_sum.cpp)
target_link_libraries(test_two_sum gtest gtest_main dsa_lib)

# exercises
add_executable(test_list_divisors test/exercises/test_list_divisors.cpp)
target_link_libraries(test_list_divisors gtest gtest_main dsa_lib)

add_executable(test_sumn test/exercises/test_sumn.cpp)
target_link_libraries(test_sumn gtest gtest_main dsa_lib)

add_executable(test_sum_squares test/exercises/test_sum_squares.cpp)
target_link_libraries(test_sum_squares gtest gtest_main dsa_lib)

add_executable(test_sum_series test/exercises/test_sum_series.cpp)
target_link_libraries(test_sum_series gtest gtest_main dsa_lib)

add_executable(test_palindrome_number test/exercises/test_palindrome_number.cpp)
target_link_libraries(test_palindrome_number gtest gtest_main dsa_lib)

add_executable(test_product_of_divisors test/exercises/test_product_of_divisors.cpp)
target_link_libraries(test_product_of_divisors gtest gtest_main dsa_lib)

# matrix
add_executable(test_analyze_matrix test/matrix/test_analyze_matrix.cpp)
target_link_libraries(test_analyze_matrix gtest gtest_main dsa_lib)

# hash table
add_executable(test_roman_to_int test/hashtable/test_roman_to_int.cpp)
target_link_libraries(test_roman_to_int gtest gtest_main dsa_lib)

# Enable testing and add tests
enable_testing()

# Register tests
# bitManipulation
add_test(NAME test_add_binary COMMAND test_add_binary)

# array
add_test(NAME test_two_sum COMMAND test_two_sum)

# exercises
add_test(NAME test_list_divisors COMMAND test_list_divisors)
add_test(NAME test_sumn COMMAND test_sumn)
add_test(NAME test_sum_squares COMMAND test_sum_squares)
add_test(NAME test_sum_series COMMAND test_sum_series)
add_test(NAME test_palindrome_number COMMAND test_palindrome_number)
add_test(NAME test_product_of_divisors COMMAND test_product_of_divisors)

# matrix
add_test(NAME test_analyze_matrix COMMAND test_analyze_matrix)

# hash table
add_test(NAME test_roman_to_int COMMAND test_roman_to_int)
