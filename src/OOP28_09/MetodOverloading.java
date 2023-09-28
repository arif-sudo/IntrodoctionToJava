package OOP28_09;

// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

//  Method overloading increases the readability of the program.

// There are two ways to overload the method in java
//  By changing number of arguments
//  By changing the data type
public class MetodOverloading {
    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}
    //  You can have any number of main methods in a class by method overloading.
    //  But JVM calls main() method which receives string array as arguments only.
    public static void main(String[] args) {
        System.out.println("Polymorphism - Metod Overloading");
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
        System.out.println("");
        System.out.println(Summer.add(11,11));
        System.out.println(Summer.add(12.3,12.6));
        System.out.println("");

        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);
        System.out.println("");

        OverloadingCalculation2 obj2 = new OverloadingCalculation2();
        obj2.sum(20,20);//now int arg sum() method gets invoked
        System.out.println("");

        OverloadingCalculation3 obj3 = new OverloadingCalculation3();
        //obj3.sum(20,20);//error occurs because of ambiguity
    }
}

class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}

class Summer{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
// Note ! In java, method overloading is not possible by changing the return type of the method only of ambiguity

//class Adder{
//    static int add(int a,int b){return a+b;}
//    static double add(int a,int b){return a+b;}  Result in error..
//}

class OverloadingCalculation1{
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

}
// If there are matching type arguments in the method, type promotion is not performed.
class OverloadingCalculation2{
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}
}

class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}
}