import java.util.ArrayList;

/**
 * Created by jeremy on 12/24/15.
 */
public class Number {

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

    public static void main(String[] args) {
        ArrayList<Double> answer = getPrimeFactors(600851475143D);
        System.out.println(answer.get(answer.size() - 1));
    }
}
