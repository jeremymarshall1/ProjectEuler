package PEuler1;

// Multiples of 3 and 5
//        Problem 1
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//        The sum of these multiples is 23.
//
//        Find the sum of all the multiples of 3 or 5 below 1000.

public class Main {

    public static void main(String[] args) {
        int maxNumber;

        if (args.length > 0) {
            maxNumber =  Integer.parseInt(args[0]);
        } else {
            maxNumber = 1000;
        }
        int totalSum = 0;
        for (int x = 0; x < maxNumber; x++) {
            if (x % 3 == 0){
                totalSum += x;
            } else if (x % 5 ==0) {
                totalSum += x;
            }
        }

        System.out.println(totalSum);
    }
}
