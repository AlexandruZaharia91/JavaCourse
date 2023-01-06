package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeworkPart2 {

    public static void main(String[] args) {
        HomeworkPart2 part2 = new HomeworkPart2();
        Scanner input = new Scanner(System.in);
        Scanner onOFF = new Scanner(System.in);


        System.out.print("Please add a number from keyboard: ");
        int valueKeyboard = input.nextInt();
        part2.compareValues(valueKeyboard);
        System.out.println("--------------------------finish ex 1 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------

        char typeOfOperation;
        char onOff = 'o';
        int number1;
        int number2;

        while (onOff == 'o') {
            System.out.print("Choose a type of operation from this list: a - sum; s- decrease; i - multiplication; p - divide; m- module ---> " + "You chose:  ");
            typeOfOperation = input.next().charAt(0);
            System.out.println("-------------------------");

            System.out.print("Choose the first number:  ");
            number1 = input.nextInt();
            System.out.println("-------------------------");

            System.out.print("Choose the second number:  ");
            number2 = input.nextInt();
            System.out.println("-------------------------");

            part2.calculator(typeOfOperation, number1, number2);

            System.out.print("Press any literal task to continue , except for closing with the c key:   ");
            onOff = onOFF.next().charAt(0);
            if (onOff != 'c') {
                onOff = 'o';
            } else {
                System.out.println("Calculator is stopped");
            }
        }
        System.out.println("--------------------------finish ex 2 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------

        part2.arrayTwo(3, 5);
        System.out.println("--------------------------finish ex 3 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------

        part2.arrayChar("AnaArePere");
        System.out.println("--------------------------finish ex 4 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------

        double[] arrayDouble = new double[]{1, 3, 7, 10, 21, 11, 4.5, 22, 10, 11, 45, 21, 22};
        part2.arrayDouble(arrayDouble);
        System.out.println("--------------------------finish ex 5 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------

        String[] elements = {"Ana", "Popescu", "Mircea", "George", "Iulia", "Ion", "Pavel", "Mircea", "Larisa"};
        part2.arrayRandom(elements);
        System.out.println("--------------------------finish ex 6 ----------------------\n\n");

//----------------------------------------------------------------------------------------------------------------------------------------------------


        List<Integer> elementsOfList = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            elementsOfList.add(j);
        }
        part2.listOfElements(elementsOfList);

        System.out.println("--------------------------finish ex 7 ----------------------\n\n");
//-------------------------------------------------------------------------------------------------------------------------------------------------------

        List<String> list = new ArrayList<>();
        int[] elementRandom = new int[3];
        part2.displayLength(list, elementRandom);
        System.out.println("--------------------------finish ex 8 ----------------------\n\n");
//-------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    //exercise 1
    public void compareValues(int valuekeyboard) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if (valuekeyboard < randomNumber) {
            System.out.println("Numarul introdus este mai mic decat " + randomNumber + "");
        } else if (valuekeyboard > randomNumber) {
            System.out.println("Numarul introdus este mai mare decat " + randomNumber + "");
        } else {
            System.out.println("Numarul introdus este egal cu "+randomNumber+"");
        }
    }

    //exercise 2
    public void calculator(char option, int number1, int number2) {
        switch (option) {
            case 'a':
                int sum = number1 + number2;
                System.out.println("sum = " + sum);
                break;
            case 's':
                int decrease = number1 - number2;
                System.out.println("decrease = " + decrease);
                break;
            case 'i':
                int multipli = number1 * number2;
                System.out.println("multiplication = " + multipli);
                break;
            case 'p':
                int  divide = number1/number2;
                System.out.println("divide = " + divide);
                break;
            case 'm':
                int module = number1 % number2;
                System.out.println("modulo = " + module);
                break;

            default:
                System.out.println("the operation is not recognized!!!!!!!!!!!!!");
                break;
        }
    }

    // exercise 3
    public void arrayTwo(int lines, int columns) {
        int[][] array = new int[lines][columns];

        for(int i = 0; i<lines; i++) {
            for(int j = 0; j<columns; j++) {
                array[i][j] = (i+j)*2;
            }
        }

        System.out.println("array dimensions: " + array.length);
        System.out.println("the first element: " + array[0][0]);
        System.out.println("last element: " + array[2][4]);
    }

    // exercise 4
    public void arrayChar(String arrayChar) {
        char[] values = new char[arrayChar.length()];
        for(int j = 0; j<arrayChar.length(); j++) {
            values[j] = arrayChar.charAt(j);
        }
        for(int i = 0; i< values.length; i++) {
            if(i % 2 == 0) {
                System.out.println("se afiseaza pe ecran caracterul de pe pozitia para: " + values[i]);
            }
        }
        System.out.println(arrayChar);

        System.out.println("---------------------------------Varianta 2---------------------------------------------------------");

        char[] elements = arrayChar.toCharArray();
        for(int i = 0; i<elements.length; i++) {
            if(i % 2 == 0) {
                System.out.println("se afiseaza pe ecran caracterul de pe pozitia para: " + elements[i]);
            }

        }
        System.out.println(arrayChar);
    }

    //exercise 5
    public void arrayDouble(double[] arrayDouble) {
        for(double elements : arrayDouble) {
            if(elements == 4.5){
                System.out.println("am gasit valoarea egala cu 4.5==" + elements);
            }else if(elements > 5) {
                System.out.println("Element peste 5 => " +elements);
            }
        }
    }

    //exercise 6
    public void arrayRandom(String[] array) {
        for(int i = 0; i<array.length; i++) {
            if (i == 7) {
                break;
            } else {
                System.out.println("Index valid");
            }

        }
    }

    //exercise 7
    public void listOfElements(List<Integer> elements) {
        int sum = 0;
        for (Integer element : elements) {
            sum = sum + element;
        }
        System.out.println("suma este = " + sum);
    }

    //exercise 8
    public void displayLength(List<String>elem, int[] elements) {
        System.out.println("length of list<String> : " + elem.size());
        for(int y : elements) {
            System.out.println("array ul este gol? => " + y);
        }
    }
}
