package ProjectEuler;

import java.util.ArrayList;

/**
 * A class to gather all the useful methods created during my Project Euler work
 * Created by jeremy on 12/24/15.
 */
public class Nums {

    public static ArrayList<Double> getPrimeFactors(double num) {
        ArrayList<Double> factors = new ArrayList<>();

        double max = num/2D;

        while (num % 2 == 0) {
            factors.add(2D);
            num /= 2D;
        }
        for (double x = 3; num > 3; x += 2) {
            while (num % x == 0) {
                factors.add(x);
                num /= x;
            }
        }


        return factors;
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


    public static void main(String[] args) {
        ArrayList<Double> answer = getPrimeFactors(600851475143D);
        System.out.println(answer.get(answer.size() - 1));
    }
}
