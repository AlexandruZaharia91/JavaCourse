package BigExercises;

public class PerfectNumbers {
    private int number;
    int[] listOfNumber;
    int sumOfNumbers = 0;

    public static void main(String[] args) {
        PerfectNumbers number = new PerfectNumbers(24);
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
        } else if (sumOfNumbers < number) {
            System.out.println("It's a Deficient number where sum < number: " + number + " < " + sumOfNumbers);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
