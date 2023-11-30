package Eolymp.SDF2;

import java.util.Scanner;

interface RegularPolygon {
    int getNumSides();
    double getSideLength();

    static int totalSides(RegularPolygon[] rpArray) {
        int sum = 0;
        for (RegularPolygon element:
             rpArray) {
            sum += element.getNumSides();
        }
        return sum;
    }

    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }
    default double getInteriorAngle() {
        return (getNumSides() - 2) * Math.PI / getNumSides();
    }
}

class EquilateralTriangle implements RegularPolygon {
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 3;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String toString() {
        return String.format("Triangle %.4f%nPerimeter: %.4f%nInterior angle: %.4f%n",
                getSideLength(), getPerimeter(), getInteriorAngle());
    }
}

class Square implements RegularPolygon {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 4;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String toString() {
        return String.format("Square %.4f%nPerimeter: %.4f%nInterior angle: %.4f%n",
                getSideLength(), getPerimeter(), getInteriorAngle());
    }
}


public class K {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        RegularPolygon[] rpArray = new RegularPolygon[n];

        for (int i = 0; i < n; i++) {
            String type = con.next();
            double sideLength = con.nextDouble();

            if (type.equals("Triangle")) {
                rpArray[i] = new EquilateralTriangle(sideLength);
            } else if (type.equals("Square")) {
                rpArray[i] = new Square(sideLength);
            }
        }

        for (RegularPolygon rp : rpArray) {
            System.out.print(rp.toString());
        }

        System.out.println("Total sides: " + RegularPolygon.totalSides(rpArray));

        con.close();
    }
}