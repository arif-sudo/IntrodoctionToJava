package OOP23_09;

public class Constructor {
    // In Java, a constructor is a block of codes similar to the method.
    // It is called when an instance of the class is created.

    // Every time an object is created using the new() keyword, at least one constructor is called.
    //
    // It calls a default constructor if there is no constructor available in the class.
    // In such case, Java compiler provides a default constructor by default.

    // Rules for creating constructor.
    // Constructor name must be the same as its class name
    // A Constructor must have no explicit return type
    // A Java constructor cannot be abstract, static, final, and synchronized

    // Types of constructor
    // Default constructor (no-arg constructor)
    // Parameterized constructor
    Constructor(){
        System.out.println("Constructor >-<");
    }
    public static void main(String[] args) {
        System.out.println("Default constructor (no-arg constructor)");
        Constructor con = new Constructor();
    }
}
