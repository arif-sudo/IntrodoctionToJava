package OOP03_10;

// The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

public class Instanceof {
    public static void main(String[] args) {
        Simple1 s = new Simple1();
        System.out.println(s instanceof Simple1);//true
        System.out.println("");

        Dog2 d = new Dog2();
        System.out.println(d instanceof Animal2);//true
        System.out.println("");

        // If we apply instanceof operator with a variable that have null value, it returns false
        Dog3 d3 = null;
        System.out.println(d3 instanceof Dog3);//false
        System.out.println("");

        Animal a = new Dog4();
//        Animal a = new Animal(); - not gives error because  we checked if "a" is instance of Dog4 in line 47
        Dog4.method(a);
        System.out.println("");

        Printable p = new B();
        Call c = new Call();
        c.invoke(p);

    }
}

class Simple1{
}
// An object of subclass type is also a type of parent class.
// For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.

class Animal2{}
class Dog2 extends Animal2{}

class Dog3 {}

// ***
// When Subclass type refers to the object of Parent class, it is known as downcasting.
// If we perform it directly, compiler gives Compilation error.
// If you perform it by typecasting, ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible.

// Dog d=new Animal(); Compilation error
// Dog d=(Dog)new Animal(); Compiles successfully but ClassCastException is thrown at runtime

class Dog4 extends Animal {
    static void method(Animal a) {
        if (a instanceof Dog4){
            Dog4 d = (Dog4)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }
}

// Understanding Real use of instanceof

interface Printable{}
class A implements Printable{
    public void a(){System.out.println("a method");}
}
class B implements Printable{
    public void b(){System.out.println("b method");}
}

class Call{
    void invoke(Printable p){ //upcasting
        if(p instanceof A){
            A a=(A)p;//Downcasting
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;//Downcasting
            b.b();
        }

    }
}