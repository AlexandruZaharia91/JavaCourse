package Exercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercises1 {


    public static void main(String[] args) {
        Exercises1 test = new Exercises1();
        Scanner scanner = new Scanner(System.in);

        test.reverseDigits(scanner.nextInt());
        test.palindrom(scanner.next());
        test.largestNumber(230,13,11);
        test.factorial(10);
        for(int i = 0;i<1000;i++) {
            test.armstrongNumber(i);
        }


    }



    public void reverseDigits(int a) {
        int reverse = 0;
        while(a >0) {
            reverse = reverse * 10 + a%10;
            a = a/10;
        }
        System.out.println(reverse);
    }


    public void palindrom(String val) {
        char[] elemente = val.toCharArray();
        String[] newVal = new String[elemente.length];

        for(int i = elemente.length-1; i>=0; i--) {
            newVal[i] = newVal[i] + elemente[i];
        }

        if(val.equals(Arrays.toString(newVal))) {
            System.out.println("este palindrom " + val + "----" + Arrays.toString(newVal));
        }else{
            System.out.println("nu este palindrom");
        }
    }


    public void largestNumber( int x, int y, int z) {
        if(x != y && y!= z && x != z) {
            if(x>y) {
                if(x>z) {
                    System.out.println("val lui x este cea mai mare");
                }else {
                    System.out.println("val lui z este cea mai mare");
                }
            }else if(y>z) {
                System.out.println("y este cel mai mare");
            }else {
                System.out.println("z este cel mai mare");
            }
        }else {
            System.out.println("numerele adaugate  nu sunt distincte ");
        }
    }


    public void factorial(int number) {
        int factorial = 1;
        for(int i = number; i>=1;i--) {
            factorial = factorial * i;
        }
        System.out.println(""+number+" factorial = " + factorial);
    }

    public void armstrongNumber(int number) {
        int temp = number;
        int[] elements = new int[10];
        int rest;
        int sum = 0;

        for(int i = 0; temp >0;i++) {
            rest = temp%10;
            elements[i] = rest;
            temp = temp/10;
        }

        for (int element : elements) {
            sum = (int) (sum + pow(element, 3));
        }

        if(number == sum) {
            System.out.println("este numar Armstrong: " + number);
        }else {
            System.out.println("nu este numar Armstrong");
        }
    }
}
