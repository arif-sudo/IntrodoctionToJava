package OOP25_09;

// "this" is a reference variable that refers to the current object.
// Usage of Java this keyword:
public class This {
    public static void main(String[] args) {
        //1) to invoke current class method
        //You may invoke the method of the current class by using "this" keyword.
        //If you don't use "this" keyword, compiler automatically adds this keyword while invoking the method. Let's see the example
        A a = new A();
        a.n();
        System.out.println("");

        //2) to invoke current class constructor
        B b = new B(12);
        System.out.println("");

        // Real usage of this() constructor call
        // The this() constructor call should be used to reuse the constructor from the constructor.
        // It maintains the chain between the constructors i.e. it is used for constructor chaining.
        // Let's see the example given below that displays the actual use of this keyword.
        Student s1 = new Student(124, "Arif", "Java OOP");
        Student s2 = new Student(125, "Umid", "Java OOP", 6000f);
        s1.display();
        s2.display();
        System.out.println("");

        // to pass as an argument in the method
        C c = new C();
        c.p();
        System.out.println("");

        // *** to pass as argument in the constructor call
        // We can pass "this" keyword in the constructor also. It is useful if we have to use one object in multiple classes
        DE de = new DE();
        System.out.println("");

        // this keyword can be used to return current class instance
        new F().getF().msg();
        System.out.println("");

        // proving this keyword
        G obj = new G();
        System.out.println(obj);
        obj.m();
    }
}

class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        this.m();
        // m(); same as this.m();
    }
}

class B {
    B(){
//        this(4); // Calling parameterized constructor from default constructor
        System.out.println("B class");
    }
    B(int x){
        this();// Calling default constructor from parameterized constructor
        System.out.println(x);
    }
}

class Student{
    int rollno;
    String name, course;
    float fee;

    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor // Rule: Call to this() must be the first statement in constructor, or the error will occur
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}

class  C {
    void m (C obj){
        System.out.println("methid is invoked");
    }

    void p(){
        m(this);
    }
}

class D {
    DE obj;
    D(DE obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);//using data member of DE class
    }
}

class DE {
    int data = 10;
    DE(){
        D d = new D(this);
        d.display();
    }
}

class F {
    F getF(){
        return this;
    }

    void msg(){
        System.out.println("Class F msg method");
    }
}

class G {
    void m(){
        System.out.println(this);
    }
}
