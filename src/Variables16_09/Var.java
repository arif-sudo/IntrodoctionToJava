package Variables16_09;

// local
// instance
// static

public class Var {
    static int a = 100;// static variable
    //You can create a single copy of the static variable and share it among all the instances of the class.
    //Memory allocation for static variables happens only once when the class is loaded in the memory.
    public static void main(String[] args ){
        int b = 50; //instance variable

        System.out.println(a);
        System.out.println(b);
        // System.out.println(n); Error

        // Simply adding 2 integers
        int num1 = 12;
        int num2 = 13;
        System.out.println(num1 + num2 ); // 25

        // Widening
        int num3 = 10;
        float f = num3;
        System.out.println(num3); // 10
        System.out.println(f);    // 10.0

        // Narrowing (Typecasting)
        float f2 = 10.7f; // The last f is a suffix that indicates that the literal value 10.5 should be treated as a float rather than a double
        //int num4 = f2; // Error
        int num4 = (int)f2;
        System.out.println(f2); // 10.7
        System.out.println(num4); // 10

        // Overflow
        int num5 = 130;
        byte byte1 = (byte) num5;
        System.out.println(num5); // 130  | 128
        System.out.println(byte1);// -126 | -128
        //  int is a 32-bit data type, while byte is an 8-bit data type
        // byte's range is from -128 to 127 which indicates to this type of overflow

        // Adding Lower Type
        byte byte2 = 11;
        byte byte3 = 12;
        byte byte4 = (byte)(byte2 + byte3);
    }
    // some method
    void method(){
        int n = 90; //local variable
    }
}
