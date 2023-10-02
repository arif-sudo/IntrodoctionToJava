package OOP02_10;

// Polymorphism in Java is a concept by which we can perform a single action in different ways.
// Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms.

// There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
// We can perform polymorphism in java by method overloading and method overriding.

// If you overload a static method in Java, it is the example of compile time polymorphism.
// Here, we will focus on runtime polymorphism in java.

// Runtime polymorphism or Dynamic Method Dispatch
// is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass

// If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
public class RuntimePolymorphism {
    public static void main(String[] args) {
        // 1) Upcasting
        A a = new B();

        // We are calling the run method by the reference variable of Parent class
        Bike2 b2 = new Splendor();//upcasting
        b2.run();
        System.out.println("");

        // bank example
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
        System.out.println("");

        //Poly with data member
        Bike3 obj = new Honda3();
        System.out.println(obj.speedlimit);// 90
        System.out.println("");

        // Last example
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow
        // *** In this example, both Dog and Cat are subclasses of Animal, and they override the makeSound method.
        // At runtime, the actual behavior of makeSound is determined by the type of the object (myDog or myCat)-
        // -rather than the reference type (Animal).
        // This is an example of runtime polymorphism in action.
    }
}

class A{}
class B extends A{}

class Bike2{
    void run(){System.out.println("running");}
}
class Splendor extends Bike2{
    void run(){
        System.out.println("running safely with 60km");
    }
}
// Bank
class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 9.7f;}
}

// Runtime Polymorphism with Data Member
// A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
class Bike3{
    int speedlimit = 90;
}
class Honda3 extends Bike3{
    int speedlimit = 150;
}

// Last example
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
