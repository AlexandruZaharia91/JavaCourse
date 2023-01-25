package BigExercises;

import java.util.Scanner;

public class StringPalindrom {

    public static void main(String[] args) {
        StringPalindrom palindrom = new StringPalindrom();
        Scanner scanner = new Scanner(System.in);
        palindrom.palindromV1(scanner.nextLine());

        System.out.println("varianta a doua de metoda pentru string palindrom --------------------------");
        palindrom.palindromV2(scanner.next());
    }

    /*
     * Check Given String is palindrome or Not in java Program
     * */
    public void palindromV1(String val) {
        int j = 0;
        char[] elemente = val.toCharArray();
        char[] newVal = new char[elemente.length];
        for (int i = elemente.length - 1; i >= 0; i--) {
            newVal[j++] = elemente[i];
        }

        if (val.equals(String.valueOf(newVal))) {
            System.out.println("este palindrom " + val + "----" + String.valueOf(newVal));
        } else {
            System.out.println("nu este palindrom   " + String.valueOf(newVal));
        }
    }

    public void palindromV2(String val) {
        String palindrom = "";
        for (int i = val.length()-1; i >= 0; i--) {
            palindrom = palindrom + val.charAt(i);
        }

        if (val.equals(palindrom)) {
            System.out.println("este palindrom " + val + "----" + palindrom);
        } else {
            System.out.println("nu este palindrom   " + palindrom);
        }

    }
}
