package BigExercises;

import Utils.Utils;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.print("add the number: ");
        factorial.factorial(Utils.scanner().nextInt());

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
}
