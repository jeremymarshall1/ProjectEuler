import java.util.ArrayList;

import static ProjectEuler.Nums.getPrimeFactors;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Created by jeremy on 12/5/15.
 */
public class PEuler3 implements Solution {

    public void solve(String[] args) {
        ArrayList<Double> factors = new ArrayList<>();
        Double num = 600851475143D;

        // Override default value to solve for if command-line arguments are found
        if (args.length > 0) {
            num = Double.parseDouble(args[0]);
        }

        factors = getPrimeFactors(num);

        System.out.println(factors.get(factors.size() - 1));
    }

    private static long[] findPrimeNumbers(double max){
        ArrayList<Long> allNumbers = new ArrayList<>(100);
        // Populate an ArrayList with all numbers starting at 2 to the provided parameter
        for (double x = 2; x < max; x++){
            allNumbers.add((long) x);
        }
        // Let's go on a brute-force adventure to find all the prime numbers within the ArrayList!
        for (int y = 0; y < allNumbers.size(); y++){
            long checkNum = allNumbers.get(y);
            for (int z = allNumbers.indexOf(checkNum)+1; z < allNumbers.size(); z++){
                if (allNumbers.get(z) % checkNum == 0){
                    allNumbers.remove(z);
                }
            }

        }
        
        // Convert to regular long array
        long[] returnValue = new long[allNumbers.size()];

        // Populate long array with discovered prime numbers
        for (int x = 0; x < allNumbers.size(); x++) {
            returnValue[x] = allNumbers.get(x);
        }

        return returnValue;


    }

    private static double findLargestPrimeFactor(long[] primeNumbers, double targetNumber){
        for (int x = primeNumbers.length-1; x > 0; x--){
            if (targetNumber % primeNumbers[x] == 0) {
                return primeNumbers[x];
            }
        }

        return 0D;
    }
}
