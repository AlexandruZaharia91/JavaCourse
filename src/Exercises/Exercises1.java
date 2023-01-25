package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Exercises1 {


    public static void main(String[] args) {
        Exercises1 test = new Exercises1();
        Armstrong  numbers = new Armstrong();
        Scanner scanner = new Scanner(System.in);
//
//        test.reverseDigits(scanner.nextInt());
        test.palindrom(scanner.next());
//        test.largestNumber(230,13,11);
//        test.factorial(10);
//        for(long i = 0;i<10000000000L;i++) {
//            numbers.armstrongNumber(i);
//        }
//        test.primeNumber(100000000000L, 10001);
//        System.out.println("numarul pozitiei pentru: " + test.primeNumberV2(100, 6));
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
        char[] newVal = new char[elemente.length];
        int j = 0;
        for (int i = elemente.length - 1; i >= 0; i--) {
            newVal[j++] = elemente[i];
        }

        if (val.equals(String.valueOf(newVal))) {
            System.out.println("este palindrom " + val + "----" + String.valueOf(newVal));
        } else {
            System.out.println("nu este palindrom   " + String.valueOf(newVal));
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
    public void primeNumber(long number, int position) {
        for(int i = 2;i<=number;i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("este numar prim " + i);

            }else {
                System.out.println("nu este numar prim " + i);
                    }
        }
    }



    public Integer primeNumberV2(long number, int positions) {
        if (positions <= 0) {
            throw new IllegalArgumentException();
        }

        return elements(number).get(positions-1);
    }


    public List<Integer> elements(long number) {
        List<Integer> elements = new ArrayList<>();
        for(int i = 2;i<=number;i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                elements.add(i);
            }
            System.out.println(elements.toString());
        }
        return elements;
    }
}



