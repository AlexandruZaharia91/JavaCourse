package Homework;

public class Caine extends Animal {
    public String sunetCaine= "Ham, Ham";

    public void latra() {
        System.out.println("cum latra cainele: " + sunetCaine);
    }

    @Override
    public void aude() {
        System.out.println("Cainele aude foarte bine");
    }

    public static void main(String[] args) {
        Animal a = new Caine();
        a.aude();
        Caine dorel = new Caine();
        dorel.latra();
    }
}
