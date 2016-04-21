/**
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Created by jeremy on 1/17/16.
 */
public class PEuler5 implements Solution {
    public void solve(String[] args) {
        int num = 20;

        if (args.length > 0) {
            num = Integer.valueOf(args[0]);
        }

        System.out.println(getSmallestMultiple(num));
    }

    public static int getSmallestMultiple(int num) {
        int multiple = num;

        for (int x = 1; x <= multiple; x++){
            if (num % x != 0) {
                num += multiple;
                x = 1;
                continue;
            }
        }

        return num;
    }
}
