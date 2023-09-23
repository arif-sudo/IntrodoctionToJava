package OOP23_09;

public class Student2 {
    int age;
    String name;
    Student2(int age, String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println(name + " " + age);
    }


    public static void main(String[] args) {
        System.out.println("Parameterized constructor");
        Student2 s = new Student2(300, "Aragorn");
        s.display();
    }

}
