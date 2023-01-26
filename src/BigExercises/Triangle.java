package BigExercises;

/*
    Instructions
    Determine if a triangle is equilateral, isosceles, or scalene.

    An equilateral triangle has all three sides the same length.

    An isosceles triangle has at least two sides the same length. (It is sometimes specified as having exactly two sides the same length, but for the purposes of this exercise we'll say at least two.)

    A scalene triangle has all sides of different lengths.

    Note
    For a shape to be a triangle at all, all sides have to be of length > 0, and the sum of the lengths of any two sides must be greater than or equal to the length of the third side.
 */

import Utils.Utils;

public class Triangle {
    double side1,side2,side3;
    public static void main(String[] args) throws Exception {
        System.out.print("val pentru latura a: ");
        double x = Utils.scanner().nextDouble();
        System.out.print("val pentru latura b: ");
        double y = Utils.scanner().nextDouble();
        System.out.print("val pentru latura c: ");
        double z = Utils.scanner().nextDouble();
        Triangle triangle = new Triangle(x,y,z);
        if(triangle.equilateralTriangle()) {
            System.out.println("este echilateral:" + triangle.equilateralTriangle());
        }else if(triangle.isoscelesTriangle()){
            System.out.println("este isoscel:" + triangle.isoscelesTriangle());
        }else if(triangle.scaleneTriangle()){
            System.out.println("este oarecare: " + triangle.scaleneTriangle());
        }else {
            System.out.println("este degenerate triangle: " + triangle.degenerateTriangle());
        }


    }

    public Triangle(double side1, double side2, double side3) throws Exception {
        if(side1>0 && side2>0 && side3>0){
            if(((side1+side2) >= side3) && ((side2 + side3) >= side1) && ((side1+side3) >= side2)){
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }else{
                throw new Exception("valorile nu sunt ok");
            }
        }else{
            throw new Exception("valorile nu sunt ok");
        }
    }


    public boolean equilateralTriangle() {
        boolean equilateral = false;
        if((side1 == side2)&& (side2 == side3)) {
            equilateral = true;
        }
        return  equilateral;
    }

    public boolean isoscelesTriangle() {
        boolean isosceles = false;
        if((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            isosceles = true;
        }
        return isosceles;
    }

    public boolean scaleneTriangle() {
        boolean scalene = false;
        if((side1 != side2) && (side2 != side3) &&!((side1 + side2) == side3)) {
            scalene = true;
        }
        return scalene;
    }

    public boolean degenerateTriangle() {
        boolean degenerate = false;
        if((side1 + side2) == side3) {
            degenerate = true;
        }
        return degenerate;
    }

}
