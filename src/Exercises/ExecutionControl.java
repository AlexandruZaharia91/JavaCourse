package Exercises;


public class ExecutionControl {


    public static void main(String[] args) {
        String[] elemente = {"Ianuarie", "Februarie", "Martie", "Aprilie,", "Mai", "Iunie", "Iulie"};
        ifMethod(3, 2);
        switchMethod('b');
        switchMethod(3);
        buclaFor(10);
        buclaFor(elemente);
        buclaWhile(8);
        doWhileMethod(5);
        buclaFor(2,3);
    }


    public static void ifMethod(int a, int b) {
        if (a > b) {
            System.out.println("a > b : " + a);
        } else if (a == b) {
            System.out.println("a == b" + a + " si " + b);
        } else {
            System.out.println("b > a: " + b);
        }
    }


    public static void switchMethod(int culoare) {

        switch (culoare) {
            case 1:
                System.out.println("Rosu");
                break;
            case 2:
                System.out.println("Galben");
                break;
            case 3:
                System.out.println("Albastru");
                break;
            case 4:
                System.out.println("Violet");
                break;
            case 5:
                System.out.println("Verde");
                break;
            case 6:
                System.out.println("Maro");
                break;
            case 7:
                System.out.println("Portocaliu");
                break;
            default:
                System.out.println("val default : Alb");
                break;
        }
    }


    public static void switchMethod(char val) {
        switch (val) {
            case 'a':
                System.out.println("Rosu");
                break;
            case 'b':
                System.out.println("Galben");
                break;
            case 'c':
                System.out.println("Albastru");
                break;
            case 'd':
                System.out.println("Violet");
                break;
            case 'e':
                System.out.println("Verde");
                break;
            case 'f':
            case 'g':
            case 'h':
                System.out.println("Portocaliu");
                break;
            default:
                System.out.println("val default : Alb");
                break;
        }
    }


    public static void buclaFor(int val) {

        for (int z = 0; z < val; z++) {
            System.out.println("z = " + z);
        }
    }

    public static void buclaFor(String[] elemente) {
        for(String elem : elemente) {
            System.out.println("elemente din array-ul de string: " + elem);
        }
    }

    public static void buclaFor(int x, int y) {
        for(int i = 0;i<5;i++) {
            System.out.println("i: " + i);
            if(i == x) {
                continue;
            }else if(i == y) {
                break;
            }
        }
    }

    public static void buclaWhile(int a) {
        int i = 0;
        while(i< a) {
            System.out.println("i : " + i);
            if(i == 5) {
                System.out.println("Hello");
            }else if(i> 6) {
                break;
            }
            i++;
        }
    }


    public static void doWhileMethod(int val) {
        do{
            System.out.println("Hello world");
            val--;
        }while(val >0);
    }








}
