package BigExercises;
import Utils.Utils;

public class ReverseDigits {

    public static void main(String[] args) {
        ReverseDigits reverse = new ReverseDigits();
        reverse.reverseDigits(Utils.scanner().nextInt());

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
}
