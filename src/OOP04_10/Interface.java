package OOP04_10;

// An interface in Java is a blueprint of a class. It has static constants and abstract methods.
// The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not method body.
// ** It is used to achieve abstraction and multiple inheritance in Java.

// Java Interface also represents the IS-A relationship.
// It cannot be instantiated just like the abstract class.

// Since Java 8, we can have default and static methods in an interface.
//Since Java 9, we can have private methods in an interface.

// Why use?
//  It is used to achieve abstraction.
//  *By interface, we can support the functionality of multiple inheritance.
//  It can be used to achieve loose coupling.

//A class that implements an interface must implement all the methods declared in the interface.

public class Interface {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.print();
        System.out.println("");

        Drawable d1 = new Circle2();//In real scenario, object is provided by method e.g. getDrawable()
        Drawable d2 = new Rectangle2();
        d1.draw();
        d2.draw();
        System.out.println("");

        A7 obj2 = new A7();
        obj2.print();
        obj2.show();
        System.out.println("");

        TestInterface2 obj3 = new TestInterface2();
        obj3.print();
        obj3.show();
        System.out.println("");

        Drawable3 d3 = new Rectangle3();
        d3.draw();
        d3.msg();
        System.out.println("");

        Drawable4 d4 = new Rectangle4();
        d4.draw();
        System.out.println(Drawable4.cube(3));

    }
}
interface printable1{
    void print();
}
class A2 implements printable1 {
    public void print(){System.out.println("Hello");}
}

// New example
interface Drawable{
    void draw();
}

class Rectangle2 implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle2 implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}

// Multiple inheritance in Java by interface
interface Printable{
    void print();
}
interface Showable{
    void show();
    void print();
}
class A7 implements Printable, Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}
}
// As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity.
// However, it is supported in case of an interface because there is no ambiguity.
// It is because its implementation is provided by the implementation class.

// Interface inheritance
interface Printable2{
    void print();
}
interface Showable2 extends Printable2{
    void show();
}
class TestInterface2 implements Showable2{
    public void print(){System.out.println("Hello 2");}
    public void show(){System.out.println("Welcome 2");}
}

// *** Java 8 Default Method in Interface
interface Drawable3{
    void draw();
    default void msg(){System.out.println("default method");}
}
class Rectangle3 implements Drawable3{
    public void draw(){System.out.println("drawing rectangle");}
}

// *** Java 8 Static Method in Interface
interface Drawable4{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle4 implements Drawable4{
    public void draw(){System.out.println("drawing rectangle");}
}
