package BigExercises;

/*
        Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

        The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.

        The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.

        Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.
 */

import Utils.Utils;

import static java.lang.Math.pow;

public class DifferenceOfSquare {

    public static void main(String[] args) {
        DifferenceOfSquare diff = new DifferenceOfSquare();
        System.out.print("please add a natural number: ");
        diff.difSumSquaresSquareSum(Utils.scanner().nextInt());
    }


    public void difSumSquaresSquareSum(int number) {

        long sumOfSquare = 0;
        long squareOfSum = 0;
        long difSumSquareAndSquareSum;
        for(int i = 0;i<=number; i++) {
            sumOfSquare = (long) (sumOfSquare + pow(i, 2));
        }

        for(int j = 0; j<=number;j++) {
            squareOfSum  = squareOfSum + j;
        }

        difSumSquareAndSquareSum = (long) (pow(squareOfSum, 2) - sumOfSquare);
        System.out.println("difference between the sum of the squares  and the square of the sum : " + difSumSquareAndSquareSum);

    }
}
