/**
 * @brief Add two binary numbers represented as strings.
 *
 * @param a First binary number as a string.
 * @param b Second binary number as a string.
 * @return std::string The result of binary addition.
 */

#include <algorithm>
#include "bitManipulation/add_binary.h"

std::string addBinary(const std::string &a, const std::string &b)
{
    std::string result = "";
    int i = a.size() - 1;
    int j = b.size() - 1;
    int carry = 0;

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

    // Reverse the result
    std::reverse(result.begin(), result.end());

    return result;
}
