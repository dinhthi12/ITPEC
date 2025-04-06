#include <algorithm>
#include "bitManipulation/add_binary.h"

/**
 * @brief Add two binary numbers represented as strings.
 *
 * This function simulates binary addition (like how you would do it by hand),
 * iterating from the end of each string and computing the sum bit-by-bit.
 *
 * @param a First binary number as a string.
 * @param b Second binary number as a string.
 * @return std::string The result of binary addition.
 */
std::string addBinary(const std::string &a, const std::string &b)
{
    std::string result = ""; // Result string to store binary sum
    int i = a.size() - 1;    // Pointer to the last character in string a
    int j = b.size() - 1;    // Pointer to the last character in string b
    int carry = 0;           // Carry for addition

    // Iterate while there are bits left in a or b or there's a carry
    while (i >= 0 || j >= 0 || carry)
    {
        int sum = carry; // Start with the carry

        // Add bit from a if available
        if (i >= 0)
            sum += a[i--] - '0'; // Convert char to int

        // Add bit from b if available
        if (j >= 0)
            sum += b[j--] - '0'; // Convert char to int

        // Append the result of sum % 2 to the result string
        result += (sum % 2) + '0'; // Convert back to char

        // Update carry
        carry = sum / 2;
    }

    // Since we were adding bits from right to left, reverse the result
    std::reverse(result.begin(), result.end());

    return result;
}
