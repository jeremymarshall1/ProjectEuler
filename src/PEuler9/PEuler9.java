package PEuler9;

import java.util.ArrayList;

/**
 * Special Pythagorean triplet
 * Problem 9
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 *
 * Created by jeremy on 2/27/16.
 */
public class PEuler9 {
    public static void main(String[] args) {
        int [] triplet = findPythagoranTriplet(1000);
        int product = 1;
        for (int x: triplet) {
            product = product * x;
        }

        System.out.println(product);

    }

    private static int[] findPythagoranTriplet(int sum) {
        int [] triplet = {0, 0, 0};
        int tripleSum = 0;

        for (int m = 1; m < Math.sqrt(sum); m++) {
            tripleSum = 0;
            for (int n = m + 1; tripleSum < sum; n++) {
                tripleSum = 0;

                /** Using Euclid's Formula, brute force pythagorean numbers
                 * With m < n
                 */
                triplet[0] = (n * n) - (m * m);
                triplet[1] = 2 * n * m;
                triplet[2] = (n * n) + (m * m);

                for (int x : triplet) {
                    tripleSum += x;
                }

            }
            if (tripleSum == sum) {
                break;
            }
        }

        if (tripleSum != sum) {
            return new int [] {0, 0, 0};
        }

        return triplet;
    }

}
