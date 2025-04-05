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
set(BITMANIP_SRC
    src/bitManipulation/addbinary.cpp
    src/bitManipulation/twosum.cpp
)

# Create lib
add_library(dsa_lib
    ${BITMANIP_SRC}
)

# Add test
add_executable(test_addbinary test/test_addbinary.cpp)
target_link_libraries(test_addbinary gtest gtest_main dsa_lib)

add_executable(test_twosum test/test_twosum.cpp)
target_link_libraries(test_twosum gtest gtest_main dsa_lib)