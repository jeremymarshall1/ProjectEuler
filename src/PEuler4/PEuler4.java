package PEuler4;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two
 * 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Created by jeremy on 12/6/15.
 */
public class PEuler4 {
    /**
     * Range of possible 3-digit numbers: 100-999
     * Range of possible products from 2 3-digit numbers: 10000 - 998001
     * Range of possible products from 2 3-digit numbers that are palindromes: 10001 - 899998
     *
     * Possible method 1: Create a palindromic number, starting with '8', and find two 3-digit numbers that
     * can be multiplied to create that number
     *
     * Possible method 2: Brute force by multiplying every 3-digit number against each other, starting with the highest
     * value, until a palindrome is found
     */

    public static void main(String[] args) {
        System.out.println(isPalindromic(1002));
    }

    public static boolean isPalindromic(int number) {
        String stNumber = Integer.toString(number);

        for (int x = 0; x < stNumber.length(); x++) {
            //What is going on here, lol
            if (!(stNumber.charAt(x) == stNumber.charAt(stNumber.length()-1-x))) {
                return false;
            }
        }
        return true;
    }
}
