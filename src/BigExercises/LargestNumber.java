package BigExercises;

import Utils.Utils;

public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber number = new LargestNumber();
        int x,y,z;
        System.out.print("add first - x number: " );
        x = Utils.scanner().nextInt();
        System.out.print("add second - y number: " );
        y = Utils.scanner().nextInt();
        System.out.print("add third - z number: ");
        z = Utils.scanner().nextInt();

        number.largestNumber(x,y,z);

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
}
