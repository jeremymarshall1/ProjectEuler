/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two
 * 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Created by jeremy on 12/6/15.
 */
public class PEuler4 implements Solution {
    /**
     * Range of possible 3-digit numbers: 100-999
     * Range of possible products from 2 3-digit numbers: 10000 - 998001
     * Range of possible products from 2 3-digit numbers that are palindromes: 10001 - 997799
     *
     * Possible method 1: Create a palindromic number and find two 3-digit numbers that
     * can be multiplied to create that number
     *
     * Possible method 2: Brute force by multiplying every 3-digit number against each other, starting with the highest
     * value, until a palindrome is found
     */

    public void solve(String[] args) {
        int rangeStart = 100;
        int rangeEnd = 999;

        int prodRangeStart = rangeStart * rangeStart;
        int prodRangeEnd = rangeEnd * rangeEnd;

        while (prodRangeEnd > prodRangeStart){
            if (isPalindromic(prodRangeEnd)){
                //find factors
                int[] checkOperands;
                checkOperands = hasThreeDigitOperands(prodRangeEnd);
                if (checkOperands[0] != 0){
                    System.out.println(checkOperands[0] + "," + checkOperands[1]);
                    System.out.println(prodRangeEnd);
                    break;
                }
                //System.out.println(prodRangeEnd);
            }
            prodRangeEnd--;
        }
    }

    public static boolean isPalindromic(int number) {

        String stNumber = Integer.toString(number);
        int endIndex = stNumber.length() -1;

        for (int x = 0; x < (stNumber.length()/2); x++) {
            if (!(stNumber.charAt(x) == stNumber.charAt(endIndex-x))) {
                return false;
            }
        }
        return true;
    }

    public static int[] hasThreeDigitOperands(int number) {
        int otherOperand;
        for (int x = 100; x < 1000; x++){
            if (number % x == 0) {
                otherOperand = number / x;
            } else {
                continue;
            }

            if ((100 <= otherOperand) && (otherOperand < 1000)) {
                int[] returnValue = new int[2];
                returnValue[0] = x;
                returnValue[1] = otherOperand;
                return returnValue;
            }
        }

        int[] returnValue = new int[2];
        returnValue[0] = 0;
        return returnValue;
    }
}
