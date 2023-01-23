package Exercises;

import java.util.Arrays;
import java.util.Scanner;


public class Exercises1 {


    public static void main(String[] args) {
        Exercises1 test = new Exercises1();
        Armstrong  numbers = new Armstrong();
        Scanner scanner = new Scanner(System.in);

        test.reverseDigits(scanner.nextInt());
        test.palindrom(scanner.next());
        test.largestNumber(230,13,11);
        test.factorial(10);
        for(long i = 0;i<1000000000000L;i++) {
            numbers.armstrongNumber(i);
        }
        test.primeNumber(300);
    }


    /*
     *Print Reverse number in java program
     * */
    public void reverseDigits(int a) {
        int reverse = 0;
        while (a > 0) {
            reverse = reverse * 10 + a % 10;
            a = a / 10;
        }
        System.out.println(reverse);
    }

    /*
     * Check Given String is palindrome or Not in java Program
     * */
    public void palindrom(String val) {
        char[] elemente = val.toCharArray();
        String[] newVal = new String[elemente.length];

        for (int i = elemente.length - 1; i >= 0; i--) {
            newVal[i] = newVal[i] + elemente[i];
        }

        if (val.equals(Arrays.toString(newVal))) {
            System.out.println("este palindrom " + val + "----" + Arrays.toString(newVal));
        } else {
            System.out.println("nu este palindrom");
        }
    }

    /*
     * Find Largest no in java Program
     * */
    public void largestNumber(int x, int y, int z) {
        if (x != y && y != z && x != z) {
            if (x > y) {
                if (x > z) {
                    System.out.println("val lui x este cea mai mare");
                } else {
                    System.out.println("val lui z este cea mai mare");
                }
            } else if (y > z) {
                System.out.println("y este cel mai mare");
            } else {
                System.out.println("z este cel mai mare");
            }
        } else {
            System.out.println("numerele adaugate  nu sunt distincte ");
        }
    }

    /*
     * Find factorial for given no Program in Java
     * */
    public void factorial(int number) {
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("" + number + " factorial = " + factorial);
    }

    /*
     * Print prime no Program in java
     * */

    public void primeNumber(int number) {

        for(int i = 2;i<=number;i++) {
            int count  = 0;
            for(int j = 1; j<=i;j++) {
                if(i%j == 0) {
                    count++;
                }

            }
            if(count == 2) {
                System.out.println("este numar prim " + i);
            }else {
                System.out.println("nu este numar prim " + i);
                    }
        }
    }
}



