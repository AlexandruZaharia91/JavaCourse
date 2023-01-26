package BigExercises;

import static java.lang.Math.pow;

public class ResistorColor {

    public static void main(String[] args) {

    }


    public int numericValueResistor(String color) {
        switch (color.toLowerCase()) {

            case "black":
                return 0;

            case "brown":
                return 1;

            case "red":
                return 2;

            case "orange":
                return 3;

            case "yellow":
                return 4;

            case "green":
                return 5;

            case "blue":
                return 6;

            case "violet":
                return 7;

            case "grey":
                return 8;

            case "white":
                return 9;

            default:
                return -1;
        }
    }


    public long multiplierNumberResistor(String color) {

        switch (color.toLowerCase()) {

            case "black":
                return 1;

            case "brown":
                return 10;

            case "red":
                return (long) pow(10,2);

            case "orange":
                return (long) pow(10,3);

            case "yellow":
                return (long) pow(10,4);

            case "green":
                return (long) pow(10,5);

            case "blue":
                return (long) pow(10,6);

            case "violet":
                return (long) pow(10,7);

            case "grey":
                return (long) pow(10,8);

            case "white":
                return (long) pow(10,9);

            case "gold":
                return (long) pow(10,-1);

            case "silver":
                return (long) pow(10,-2);

            default:
                return -1;
        }

    }





}
