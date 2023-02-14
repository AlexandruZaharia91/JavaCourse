package Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputKeyboard {


    public static void main(String[] args) throws FileNotFoundException {
        int[] values = new int[10];
        String[] elem = new String[5];
        int i = 0;
        int j = 0;
        File text = new File("E://QA Automation//JavaCourse//src//DataInput");
        Scanner input = new Scanner(text);
        Scanner inputKeyboard = new Scanner(System.in);

        while (input.hasNext()) {
            values[i] = input.nextInt();
            i++;
        }

        System.out.println("suma elementelor din fisierul DataInput este: " + sum(values));

//        System.out.print("scrie ceva la tastatura: ");
//        int val = inputKeyboard.nextInt();
//        System.out.println(val);

        while (j < elem.length) {
            System.out.print("adauga val de la tastatura: ");
            elem[j] = inputKeyboard.next();
            j++;
        }
        suma(elem);
    }





    /**
     *  aceasta metoda va returna un String alcatuit dintr-o propozitie si parametru input
     * @param input - data type String
     * @return - String
     */
    public static String inputKeyboard(String input) {
        return "Mesajul transmis de la tastatura este: " + input;
    }

    /**
     *  aceasta metoda calculeaza suma tuturor elementelor dintr-un array de int
     * @param a - data type int[]
     * @return - returneaza variabila sum de tip int
     */
    public static int sum(int[] a) {
        int sum = 0;
        int i = 0;
        for(;i< a.length;i++) {
            sum = sum + a[i];
        }
//        for (int j : a) {
//            sum = sum + j;
//        }
        return sum;
    }

    /**
     *
     * @param inputs data type String[]
     * @return - dat type void
     */
    public static void suma(String[] inputs) {
        int sum = 0;
        for (int i = 0; i< inputs.length;i++) {
            sum = Integer.parseInt(inputs[i]) + sum;
        }
        System.out.println("sum: " + sum);

        //acesta este un comentariu
        System.out.println("Primul comentariu");

        /* codul acesta va fi ignorat de java fara sa afecteze compilarea
       programului Java */
        System.out.println();

    }


}
