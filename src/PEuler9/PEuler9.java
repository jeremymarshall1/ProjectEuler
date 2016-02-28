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
        for (int x: triplet) {
            System.out.println(x);
        }

    }

    private static int[] findPythagoranTriplet(int sum) {
        int [] triplet = new int [3];

        triplet[0] = 0;
        triplet[1] = 0;
        triplet[2] = 0;

        return triplet;
    }

}
