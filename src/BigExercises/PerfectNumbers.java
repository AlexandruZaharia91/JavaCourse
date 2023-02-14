package BigExercises;

/*
Determine if a number is perfect, abundant, or deficient based on Nicomachus' (60 - 120 CE)
classification scheme for positive integers.

The Greek mathematician Nicomachus devised a classification scheme for positive integers,
identifying each as belonging uniquely to the categories of perfect, abundant, or deficient
based on their aliquot sum. The aliquot sum is defined as the sum of the factors of a number
not including the number itself. For example, the aliquot sum of 15 is (1 + 3 + 5) = 9

Perfect: aliquot sum = number
6 is a perfect number because (1 + 2 + 3) = 6
28 is a perfect number because (1 + 2 + 4 + 7 + 14) = 28
Abundant: aliquot sum > number
12 is an abundant number because (1 + 2 + 3 + 4 + 6) = 16
24 is an abundant number because (1 + 2 + 3 + 4 + 6 + 8 + 12) = 36
Deficient: aliquot sum < number
8 is a deficient number because (1 + 2 + 4) = 7
Prime numbers are deficient
Implement a way to determine whether a given number is perfect. Depending on your language track,
you may also need to implement a way to determine whether a given number is abundant or deficient.
 */

public class PerfectNumbers {
    private int number;
    int[] listOfNumber;
    int sumOfNumbers = 0;

    public static void main(String[] args) {
        PerfectNumbers number = new PerfectNumbers(7);
        number.perfectNumber();
    }

    public  PerfectNumbers(int number) {
        if(number < 1) {
            throw new IllegalArgumentException("please add a number bigger than 1 and positiv");
        }
        this.setNumber(number);
    }

    public void perfectNumber() {
        int sum = 0;
        for(int i = 1; i< number;i++) {
            if(number % i == 0) {
                listOfNumber = new int[number];
                listOfNumber[i] = i;
            }
            sumOfNumbers = sumOfNumbers + listOfNumber[i];
        }

        if(sumOfNumbers == number) {
            System.out.println("It's a perfect number where sum == number: " + number + " == " + sumOfNumbers);
        } else if (sumOfNumbers > number) {
            System.out.println("It's a Abundant number where sum > number: " + number + " > " + sumOfNumbers);
        } else {
            System.out.println("It's a Deficient number where sum < number: " + number + " < " + sumOfNumbers);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
