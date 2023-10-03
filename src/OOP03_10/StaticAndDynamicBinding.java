package OOP03_10;

// Connecting a method call to the method body is known as binding.
//  There are two types of binding
//      Static Binding (also known as Early Binding).
//      Dynamic Binding (also known as Late Binding).

// Understanding Type: Let's understand the type of instance.
// 1) variables have a type
//  Each variable has a type, it may be primitive and non-primitive.
//  int data=30;
//  Here data variable is a type of int.

// 2) References have a type
//  class Dog{};
//  Dog d1;
// Here d1 is a type of Dog

// 3) Objects have a type
//  An object is an instance of particular java class,but it is also an instance of its superclass.
// Dog d1 = new Dog();

public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.print();
        // d1.eat (from inside of class);
        System.out.println("");

        Animal a = new Dog1(); // upcasting
        a.eat();
        // In the above example object type cannot be determined by the compiler, because the instance of Dog is also an instance of Animal.
        // So compiler doesn't know its type, only its base type.
    }
}
// When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//  If there is any private, final or static method in a class, there is static binding.
class Dog {
    private void eat(){
        System.out.println("dog is eating");
    }
    public void print(){
        this.eat();
    }
}
class Animal{
    void eat(){System.out.println("animal is eating...");}
}

class Dog1 extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}
