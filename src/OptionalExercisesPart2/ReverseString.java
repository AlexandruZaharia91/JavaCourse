package OptionalExercisesPart2;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverse("cool"));
    }


    public String reverse(String inputString) {
        char[] elemente = inputString.toCharArray();
        String[] newVal = new String[elemente.length];

        for (int i = elemente.length - 1; i >= 0; i--) {
            newVal[i] = newVal[i] + elemente[i];
        }

        return Arrays.toString(newVal);

    }
}
