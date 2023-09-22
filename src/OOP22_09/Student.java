package OOP22_09;

public class Student {
    private int roll;
    private String name;

    public int getRoll(){    // accessor method
        return roll;
    }

    public void setRoll(int roll){ // mutator method
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRoll(11);
        s1.setName("Elrond");
        s1.display();
    }
}
