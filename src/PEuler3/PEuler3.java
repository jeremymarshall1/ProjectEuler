package PEuler3;

import java.util.ArrayList;
import java.util.List;

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
        double squareMax = Math.sqrt(600851475143D);
        findPrimeNumbers(squareMax);
    }

    private static ArrayList<Long> findPrimeNumbers(double max){
        ArrayList<Long> allNumbers = new ArrayList<Long>(100);

        for (double x = 2; x < max; x++){
            allNumbers.add((long) x);
        }

        for (long y: allNumbers){
            long checkNum = y;
            for (int z = allNumbers.indexOf(checkNum)+1; z < allNumbers.size(); z++){
                if (allNumbers.get(z) % checkNum == 0){
                    allNumbers.remove(z);
                }
            }

        }

        System.out.println("test");

        return allNumbers;
    }
}
