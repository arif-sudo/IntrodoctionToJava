package Operators18_09;

public class Operator {
    public static void main(String[] args) {
        // Unary operator
        // Example 1
        int x = 10;
        System.out.println(x++); // 10 (11)
        System.out.println(++x); // 12
        System.out.println(x--); // 12 (11)
        System.out.println(--x); // 10
        // Example 2
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);// 10 + 12 = 22
        System.out.println(b++ + b++);// 10 + 11 = 21

        // ~ and !
        a = 10;
        b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true

        // Left shift operator
        // The Java left shift operator << is used to shift all the bits in a value to the left side of a specified number of times.
        System.out.println(10<<2);// 10*2^2=10*4=40
        System.out.println(10<<3);// 10*2^3=10*8=80
        System.out.println(20<<2);// 20*2^2=20*4=80
        System.out.println(15<<4);// 15*2^4=15*16=240

        // Right shift operator
        // The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.
        System.out.println(10>>2);// 10/2^2=10/4=2
        System.out.println(20>>2);// 20/2^2=20/4=5
        System.out.println(20>>3);// 20/2^3=20/8=2

        // >> VS >>>
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
        // the bit furthest to the left is called the most significant bit (msb) '

        System.out.println("");

        // Logical && vs Bitwise &
        a = 10;
        b = 5;
        int y = 20;
        //The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
        //The bitwise & operator always checks both conditions whether first condition is true or false.

        System.out.println(a<b && a<y);//false && true = false
        System.out.println(a<b & a<y);//false & true = false
        System.out.println("");
        System.out.println(a<b && a++<y);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b & a++<y);//false && true = false
        System.out.println(a);//11 because second condition is checked

        System.out.println("");

        // Logical || and Bitwise |
        a = 10;
        b = 5;
        y = 20;
        System.out.println(a>b || a<y);//true || true = true
        System.out.println(a>b | a<y);//true | true = true

        System.out.println(a>b || a++<y);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b | a++<y);//true | true = true
        System.out.println(a);//11 because second condition is checked

        System.out.println("");

        // Ternary Operator
        a = 2;
        b = 5;
        int min = (a<b) ? a : b;
        System.out.println(min);

        System.out.println("");

        // Assignment Operator Example: Adding short
        short a1 = 10;
        short b1 = 10;
        //a1 += b1;
        //a1 = a1 + b1 internally so fine
        //a1 = a1 + b1;// **Compile time error because 10+10=20 now int
        a1=(short)(a1+b1);
        System.out.println(a1); // 20
        
    }
}
