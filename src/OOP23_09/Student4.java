package OOP23_09;

public class Student4 {
    int num;
    String name;

    Student4(int num, String name){
        this.num = num;
        this.name = name;
    }

    Student4(Student4 s){
        this.name = s.name;
        this.num = s.num;
    }

    void display(){
        System.out.println(name + " " + num);
    }

    public static void main(String[] args) {
        System.out.println("Copy Constructor");
        Student4 s1 = new Student4(912, "Azrog");
        Student4 s2 = new Student4(s1);
        s1.display();
        s2.display();
    }
}
