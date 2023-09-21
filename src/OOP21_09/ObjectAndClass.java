package OOP21_09;
public class ObjectAndClass {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id + " " + s1.name);
        // 3 Ways to initialize object
        // There are 3 ways to initialize object in Java.
        //     By reference variable
        //     By method
        //     By constructor
        // Initializing an object means storing data into the object

        // Initializing through reference
        Student s2 = new Student();
        s2.id = 103;
        s2.name = "Caladriel";
        System.out.println(s2.id + " " + s2.name);

        // Initialization through method

        Student s3 = new Student();
        s3.insertRecord(123, "Elrond");
        System.out.println(s3.rollnumber + " " + s3.name);
        // Object gets the memory in heap memory area.
        // The reference variable which is stored in stack refers to the object allocated in the heap memory area.

        // Anonymous object
        // Anonymous simply means nameless.
        // An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
        // If you have to use an object only once, an anonymous object is a good approach.

        //anonymous object
        new Calculation();

        //Calling method through an anonymous object.
        new Calculation().fact(5);
    }
}

 class Student{
    int id = 2023;
    String name = "Mithrandir";
     /*
       A variable which is created inside the class but outside the method is known as an instance variable.
       Instance variable doesn't get memory at compile time.
       It gets memory at runtime when an object or instance is created. That is why it is known as an instance variable.
     */
    int rollnumber;
    void insertRecord(int r, String n){
         rollnumber=r;
         name=n;
    }
 }

 class Calculation {
    void fact(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        System.out.println("Factorial is " + fact);
    }
 }
