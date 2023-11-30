import java.util.Scanner;

interface GeometricObject {
    double getParameter();
    double getArea();
}


class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


interface Resizable {
    void resize(double percentage);
}


class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percentage) {
        radius = radius * percentage / 100.0;

    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResizableCircle circle = new ResizableCircle(1);

        while (scanner.hasNext()) {
            String instruction = scanner.next();

            switch (instruction) {
                case "Area":
                    System.out.println(circle.getArea());
                    break;
                case "Perimeter":
                    System.out.println(circle.getParameter());
                    break;
                case "Resize":
                    double percent = scanner.nextDouble();
                    circle.resize(percent);
                    break;
                default:
                    System.out.println("");
            }
        }
    }
}