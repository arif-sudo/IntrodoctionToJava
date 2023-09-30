package OOP30_09;

// The covariant return type specifies that the return type may vary in the same direction as the subclass.

public class CovariantReturnType {
    public static void main(String[] args) {
        System.out.println("CRT");
        new B().get().msg();// Welcome to covariant return type
        System.out.println("");

//        A1 a1 = new A1();
//        // this is ok
//        a1.foo().print();
//
//        A2 a2 = new A2();
//        // we need to do the type casting to make it clearer to reader about the kind of object created
//        ((A2)a2.foo()).print();
//
//        A3 a3 = new A3();
//        // doing the type casting
//        ((A3)a3.foo()).print();
//        System.out.println("");

        A1 a1 = new A1();

        a1.foo().print();

        A2 a2 = new A2();

        a2.foo().print();

        A3 a3 = new A3();

        a3.foo().print();
    }
}

class A {
    A get(){
        return this;
    }
}

class B extends A {
    B get(){
        return this;
    }
    void msg(){
        System.out.println("Welcome to covariant return type");
    }
}
// *** As you can see in the above example, the return type of the get() method of A class is A,
// but the return type of the get() method of B class is B.
// Both methods have different return type, but it is method overriding.
// This is known as covariant return type.

//class A1 {
//    A1 foo() {
//        return this;
//    }
//
//    void print() {
//        System.out.println("Inside the class A1");
//    }
//}
//
//// A2 is the child class of A1
//class A2 extends A1 {
//    @Override
//    A1 foo(){
//        return this;
//    }
//
//    void print() {
//        System.out.println("Inside the class A2");
//    }
//}
//
//// A3 is the child class of A2
//class A3 extends A2 {
//    @Override
//    A1 foo() {
//        return this;
//    }
//
//    @Override
//    void print() {
//        System.out.println("Inside the class A3");
//    }
//}
// It is a bad practice, because each class has same return type

class A1 {
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A1");
    }
}


// A2 is the child class of A1
class A2 extends A1{
    @Override
    A2 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A2");
    }
}

// A3 is the child class of A2
class A3 extends A2 {
    @Override
    A3 foo() {
        return this;
    }

    @Override
    void print() {
        System.out.println("Inside the class A3");
    }
}
// Better way