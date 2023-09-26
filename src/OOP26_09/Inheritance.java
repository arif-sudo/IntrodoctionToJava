package OOP26_09;

// Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
// It is an important part of OOP

// Why use Inheritance?
//    For Method Overriding (so runtime polymorphism can be achieved).
//    For Code Reusability.

// The extends keyword indicates that you are making a new class that derives from an existing class.
// The meaning of "extends" is to increase the functionality.

// A class which is inherited is called a parent or superclass, and the new class is called child or subclass.

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
        System.out.println("");

        // 1) single inheritance
        Dog d = new Dog();
        d.bark();
        d.eat();
        System.out.println("");

        // 2
        BabyDog b = new BabyDog();
        b.bark();
        b.eat();
        b.weep();
        System.out.println("");

        // 3
        Cat c = new Cat();
        c.meow();
        c.eat();
        System.out.println("");

        // Note !
        // Question:  Why multiple inheritance is not supported in java?
        // To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
        // It supported in languages such as C++
    }
}

class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
}
//  Programmer is the subclass and Employee is the superclass.
//  The relationship between the two classes is Programmer IS-A Employee.
//  It means that Programmer is a type of Employee.

// Types of Inheritance:
//  On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.
//  In java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.

// 1) single inheritance
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}

// 2) multilevel inheritance
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

// 3) hierarchical inheritance
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}