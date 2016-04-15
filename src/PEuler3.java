import java.util.ArrayList;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Created by jeremy on 12/5/15.
 */
public class PEuler3 {

    public static void main(String[] args) {
        ArrayList<Double> factors = new ArrayList<>();



        factors = Nums.getPrimeFactors(600851475143D);


        System.out.println(factors.get(factors.size() - 1));
    }

    private static long[] findPrimeNumbers(double max){
        ArrayList<Long> allNumbers = new ArrayList<>(100);

        for (double x = 2; x < max; x++){
            allNumbers.add((long) x);
        }

        for (int y = 0; y < allNumbers.size(); y++){
            long checkNum = allNumbers.get(y);
            for (int z = allNumbers.indexOf(checkNum)+1; z < allNumbers.size(); z++){
                if (allNumbers.get(z) % checkNum == 0){
                    allNumbers.remove(z);
                }
            }

        }

        long[] returnValue = new long[allNumbers.size()];

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
