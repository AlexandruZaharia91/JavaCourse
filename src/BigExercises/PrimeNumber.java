package BigExercises;

import Utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        System.out.println("add a number: ");
        prime.primeNumber(Utils.scanner().nextInt());

        System.out.println("-------------------second exercise with prime number position: ");

        System.out.print("add the number for prime number: ");
        int x = Utils.scanner().nextInt();
        System.out.print("What numbers is for this position: ");
        int y = Utils.scanner().nextInt();
        System.out.println(prime.primeNumberPosit(x, y));
    }

    /*
     * Print prime no Program in java
     * */
    public void primeNumber(long number) {
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("este numar prim " + i);

            } else {
                System.out.println("nu este numar prim " + i);
            }
        }
    }

    /*
     * Given a number n, determine what the nth prime is.

        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * */
    public Integer primeNumberPosit(long number, int positions) {
        if (positions <= 0) {
            throw new IllegalArgumentException();
        }
        return elements(number).get(positions - 1);
    }

    /*
     * this methos is used for : Print prime with x position
     * */
    public List<Integer> elements(long number) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                elements.add(i);
            }
        }
        return elements;
    }


}
