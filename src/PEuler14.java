import java.math.BigInteger;

/**
 * Longest Collatz sequence
 * Problem 14
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been
 * proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * Created by jeremy on 5/3/16.
 */

public class PEuler14 implements Solution {
    public void solve(String[] args) {
        long longestChain = 0;
        long currentChain;

        for (long x = 1; x < 1000000; x++){
            currentChain = collatzLen(x);
            if (currentChain >= longestChain) {
                longestChain = currentChain;
                System.out.println("The new largest chain is " + longestChain + " numbers created from " + x);
            }
        }
        //collatzLen(983039L);
    }

    long collatzLen(long x) {

        if (x == 1) {
            //System.out.println(x);
            return x;
        }

        //System.out.print(x + ", ");
        x = (x % 2 == 0) ? collatzLen(x / 2) : collatzLen(3 * x + 1);
        x++;
        //System.out.println(x);
        return x;
    }
}
