package BigExercises;

import Utils.Utils;

public class ReverseString extends Utils {

    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverse(scanner().nextLine()));
    }

    /*
     * Reverse String
     * */
    public String reverse(String val) {
        char[] elemente = val.toCharArray();
        char[] newVal = new char[elemente.length];
        int j = 0;
        for (int i = elemente.length - 1; i >= 0; i--) {
            newVal[j++] = elemente[i];
        }

        return String.valueOf(newVal);

    }
}
