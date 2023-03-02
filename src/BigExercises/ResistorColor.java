package BigExercises;

import static java.lang.Math.pow;

public class ResistorColor {

    public static void main(String[] args) {
        ResistorColor resistor = new ResistorColor();
        System.out.println( resistor.resistorValue(new String[]{"Red", "Yellow", "Orange", ""}));
        System.out.println("second varinat --- " + resistor.numericValueResistorV1(new String[] { "brown", "black" }));
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


    public int resistorValue(String[] resistorValue) {
        int colorValue = 0;
        int resistorValues = 0;

        for(int i = 0; i<resistorValue.length - 2;i++) {
            colorValue = colorValue * 10 + numericValueResistor(resistorValue[i]);
        }

        for(int j = resistorValue.length - 2; j < resistorValue.length-1; j++) {
            resistorValues = (int) (colorValue * multiplierNumberResistor(resistorValue[j]));
        }

        return  resistorValues;
    }


    public int numericValueResistorV1(String[] color) {
            int newVal = 0;
            int value;
        for(int i = 0;i<color.length;i++) {

            switch (color[i].toLowerCase()) {

                case "black":
                    value = 0;
                    break;

                case "brown":
                    value = 1;
                    break;

                case "red":
                    value = 2;
                    break;

                case "orange":
                    value = 3;
                    break;

                case "yellow":
                    value = 4;
                    break;

                case "green":
                    value = 5;
                    break;

                case "blue":
                    value = 6;
                    break;

                case "violet":
                    value = 7;
                    break;

                case "grey":
                    value = 8;
                    break;

                case "white":
                    value = 9;
                    break;

                default:
                    value = -1;
            }
            newVal = newVal *10 + value;
        }
        return newVal;
    }

}
