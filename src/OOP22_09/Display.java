package OOP22_09;

public class Display {
    // The main advantage of a static method is that we can call it without creating an object.
    // It can access static data members and also change the value of it.
    // It is used to create an instance method. It is invoked by using the class name.
    // The best example of a static method is the main() method.
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("It is an example of static method.");
    }
}
