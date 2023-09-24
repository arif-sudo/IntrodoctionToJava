package OOP24_09;

// The static keyword in Java is used for memory management mainly.

// The static can be:
//   Variable (also known as a class variable)
//   Method (also known as a class method)
//   Block
//   Nested class

// The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
// The static variable gets memory only once in the class area at the time of class loading.
// Advantages of static variable: It makes your program memory efficient

// If you apply static keyword with any method, it is known as static method.
//  A static method belongs to the class rather than the object of a class.
//  A static method can be invoked without the need for creating an instance of a class.
//  A static method can access static data member and can change the value of it.

// There are two main restrictions for the static method. They are:
//  The static method can not use non-static data member or call non-static method directly.
//  this and super cannot be used in static context.
public class Static {
    static {
        System.out.println("Static block executed ?");
        // but it was possible till JDK 1.6.
        // Since JDK 1.7, it is not possible to execute a Java class without the main method.
    }

    public static void main(String[] args) {
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        Student.college = "Bmu";
        Student.change();
        s1.display();// 111 Karan Bmu
        s2.display();// 222 Aryan Bmu
        System.out.println("");
        Counter c1 = new Counter();// 1
        Counter c2 = new Counter();// 1
        Counter c3 = new Counter();// 1
        System.out.println("");
        Counter2 C1 = new Counter2();// 1
        Counter2 C2 = new Counter2();// 2
        Counter2 C3 = new Counter2();// 3

    }
}

class Student{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}

class Counter{
    int count=0;//will get memory each time when the instance is created

    Counter(){
        count++;//incrementing value
        System.out.println(count);
    }
}

class Counter2 {
    static int count = 0;//will get memory only once and retain its value
    Counter2(){
        count++;
        System.out.println(count);
    }
}