package OOP22_09;

//The method that does not have method body is known as abstract method
abstract class Demo { //abstract class
    //abstract method declaration
    abstract void display();
}

public class MyClass extends Demo {
    void display() {
        System.out.println("Abstract method?");
    }

    public static void main(String args[]) {
        Demo obj = new MyClass();
        obj.display();
    }
}
