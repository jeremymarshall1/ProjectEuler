package PEuler6;

/**
 * Sum square difference
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * Created by jeremy on 1/17/16.
 */
public class PEuler6 {
    public static int getSumSqDiff(int num) {
        int sumSquare = 0;
        int squareSum = 0;
        int diff = 0;

        for (int x = 1; x <= num; x++) {
            sumSquare += x * x;
            squareSum += x;
        }

        squareSum *= squareSum;

        if (squareSum > sumSquare) {
            squareSum *= -1;
            sumSquare *= -1;
        }

        return (sumSquare - squareSum);
    }

    public static void main(String[] args) {
        System.out.println(getSumSqDiff(100));
    }
}
