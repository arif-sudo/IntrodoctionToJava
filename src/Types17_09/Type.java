package Types17_09;

// primitive
//      int, long, short, byte, boolean, char, float, double etc.
//      stores data
//      can hold only 1 value
//      less memory / fast
// reference
//      user defined - Strings, Arrays, Classes, Interface, etc.
//      stores an adderess
//      can hold more than 1 value
//      more memory / slow

// A primitive type has always a value, while non-primitive types can be null.
// A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
public class Type {
    public static void main(String[] args) {
        System.err.println("Type");
        byte a = 10;
        byte b = 20;
        // It is an 8-bit signed two's complement integer.
        // Its value-range lies between -128 to 127 (inclusive).

        short c = 10000;
        short d = -5000;
        // The short data type is a 16-bit signed two's complement integer.
        // Its value-range lies between -32,768 to 32,767 (inclusive)

        int e = 100_000;
        int f = -200_000;
        // The int data type is a 32-bit signed two's complement integer.
        // Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive).

        long g = 100000L;
        long h = -200000L;
        //  The long data type is a 64-bit two's complement integer.
        //  Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).

        float i = 234.5f;
        // The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited.
        // It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers.

        double j = 12.3;
        // The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.
        // The double data type is generally used for decimal values just like float.

        char k = 'A';
        //The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
        // The char data type is used to store characters.
    }
}
