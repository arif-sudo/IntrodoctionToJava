package OOP04_10;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Another way, it shows only essential things to the user and hides the internal details
// Abstraction lets you focus on what the object does instead of how it does it.

// *** Ways to achieve Abstraction
//  Abstract class (0 to 100%)
//  Interface (100%)

public class Abstract {
    public static void main(String[] args) {
        //In real scenario, method is called by programmer or user
        Shape s = new Rectangle1();//In a real scenario, object is provided through method, e.g., getShape() method
        Shape s2 = new Circle1();
        s.draw();
        s2.draw();
        System.out.println("");

        Bike b = new Honda();
        b.run();
        b.changeGear();
        System.out.println("");

        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
// A class which is declared as abstract is known as an abstract class.
// It can have abstract and non-abstract methods.
// It needs to be extended and its method implemented.
// It cannot be instantiated.

// Example of abstract class
abstract class A1 {
     // Example of abstract method
     abstract void printStatus();
}


//Understanding the real scenario of Abstract class
abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle1 extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

// ** Abstract class having constructor, data member and methods

abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){
        System.out.println("running safely..");
    }
}
// *** Rule: If there is an abstract method in a class, that class must be abstract.

// Another real use case of abstract class

interface A{
    void a();
    void b();
    void c();
    void d();
}
// The abstract class can also be used to provide some implementation of the interface.
// In such case, the end user may not be forced to override all the methods of the interface.
abstract class B implements A{
    public void c(){System.out.println("I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}
