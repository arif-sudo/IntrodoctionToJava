package OOP01_10;

// Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
public class InstanceInitializerBlock {
    public static void main(String[] args) {
        System.out.println("Instance initializer block");
        Bike b1 = new Bike();
        System.out.println("");

        Bike2 b2 = new Bike2();
        System.out.println("");

        B bi = new B();
        B bu = new B(10);
    }
}
// Example of Instance Initializer Block
class Bike{
    int speed;

    Bike(){System.out.println("speed is " + speed);}

    {speed=100;}
}
// There are three places in java where you can perform operations:
//  method
//  constructor
//  block
class Bike2{
    int speed;

    Bike2(){
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

}
// *** In the above example, it seems that instance initializer block is firstly invoked but NO.
// Instance intializer block is invoked at the time of object creation.
// The java compiler copies the instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked. Let's understand it by the figure given below:
// https://static.javatpoint.com/images/instanceinitializerblock.jpg


class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("child class constructor invoked");
    }

    B(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}
}
// Satic Initialization Block:
//  Static blocks are associated with the class itself rather than with instances of the class.
//  They are executed only once when the class is loaded into memory, typically during class loading.
//  Static blocks are used to perform one-time setup tasks for the entire class, such as initializing static variables or setting up resources shared by all instances of the class.

// Instance Initializer Block (Instance Block):
//  Instance initializer blocks are associated with instances (objects) of the class.
//  They are executed each time an object of the class is created, just before the constructor is called.
//  Instance blocks are used for performing instance-specific initialization tasks that are common to all constructors of the class.