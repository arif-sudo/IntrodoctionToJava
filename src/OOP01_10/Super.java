package OOP01_10;

// The super keyword in Java is a reference variable which is used to refer immediate parent class object.

public class Super {
    public static void main(String[] args) {
        System.out.println("Super");
        //1) super is used to refer immediate parent class instance variable.
        Dog d = new Dog();
        d.printColor();
        System.out.println("");

        //2) super can be used to invoke parent class method
        Dog2 d2 = new Dog2();
        d2.work();
        System.out.println("");

        //3) super() is used to invoke parent class constructor.
        Dog3 d3 = new Dog3();
        System.out.println("");

        // super example: real use
        Emp e1 = new Emp(1,"ankit",45000f);
        e1.display();
    }
}
// We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
class Animal{
    String color="white";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
// The super keyword can also be used to invoke parent class method.
// It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
class Animal2{
    void eat(){System.out.println("eating...");}
}
class Dog2 extends Animal2{
    void eat(){System.out.println("eating sandwich...");}
    void work(){
        super.eat();
        this.eat();
    }
}
// The super keyword can also be used to invoke the parent class constructor.
class Animal3{
    Animal3(){
        System.out.println("animal is created");
    }
}
class Dog3 extends Animal3{
    Dog3(){
        super();
        System.out.println("dog is created");
    }
}
// *** Note
// super() is added in each class constructor automatically by compiler if there is no super() or this().
// As we know well that default constructor is provided by compiler automatically if there is no constructor. But, it also adds super() as the first statement.

// Let's see the real use of super keyword.
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }

    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}
