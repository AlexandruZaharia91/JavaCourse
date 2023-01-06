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
        File text = new File("/Users/alzaharia/Documents/Personale/Section2/QA_Automation/src/DataInput");
        Scanner input = new Scanner(text);
        Scanner inputKeyboard = new Scanner(System.in);

        while (input.hasNext()) {
            values[i] = input.nextInt();
            i++;
        }

        System.out.println("suma elementelor din fisierul DataInput este: " + sum(values));

        System.out.print("scrie ceva la tastatura: ");
        System.out.println(inputKeyboard(inputKeyboard.nextLine()));

        while (j < elem.length) {
            System.out.print("adauga val de la tastatura: ");
            elem[j] = inputKeyboard.next();
            j++;
        }
        multiplication(elem);
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
     * @return - returneaza variabila sum
     */
    public static int sum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }

    public static void multiplication(String[] inputs) {
        int multipli = 0;
        for (String elem : inputs) {
            multipli = Integer.parseInt(elem) + multipli;
        }
        System.out.println("multiplication: " + multipli);

        //acesta este un comentariu
        System.out.println("Primul comentariu");



        /* codul acesta va fi ignorat de java fara sa afecteze compilarea
       programului Java */
        System.out.println();

    }


}
