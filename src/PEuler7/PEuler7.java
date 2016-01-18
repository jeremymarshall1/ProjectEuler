package PEuler7;

import java.util.ArrayList;

/**
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Created by jeremy on 1/17/16.
 */

public class PEuler7 {

    public static void main(String[] args) {

        System.out.println(findSpecificPrime(10001));
    }

    public static double findSpecificPrime(int index) {
        ArrayList<Double> foundPrimes = new ArrayList<>();
        Boolean isPrime = true;

        foundPrimes.add(2D);
        foundPrimes.add(3D);

        for (double x = 5D; foundPrimes.size() < index; x += 2D) {

            for (double p : foundPrimes) {
                if (x % p == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                foundPrimes.add(x);
            }

            isPrime = true;

        }

        return foundPrimes.get(index-1);

    }
}
