package Exercises;

public class Operators {
    static int a = 5;
    static int b = 34;
    static int c = 14;

    public static void main(String[] args) {

        // Type Casting Java
        double d = 1024.530;
        long l = (long) d;
        int i = (int) l;
        System.out.println("inainte de comnversie: " + d);
        System.out.println("dupa conversie cu long: " + l);
        System.out.println("dupa conversie din long in int: " + i);

        //operatori aritmetici

        int sum = (a + b) * c;
        int modulo = 13 % 2;
        System.out.println("modulo: " + modulo);

        int x = 1;
        int y = 3;
        System.out.println("x: " + x++);
        System.out.println("x: " + ++x);

        System.out.println("y: " + --y);
        System.out.println("y: " + y--);
        System.out.println("y: " + y);

        //operatori ternari
        System.out.println("x>y? : " + (x > y ? "adv" : "fals"));
        String val = ((x % 2 == 0) ? "par" : "impar");
        System.out.println("val: " + val);

        // pasarea arg prin valoare

    }

    public int f(int z) {
        return z++;
    }

    public void g() {
        int q = 3;
        System.out.println(f(q));
    }


}
