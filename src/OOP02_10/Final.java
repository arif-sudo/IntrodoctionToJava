package OOP02_10;
// The final keyword in java is used to restrict the user.
// final can be used as:
//  variable
//  method
//  class

// A final variable that have no value it is called blank final variable or uninitialized final variable.
// It can be initialized in the constructor only.
// The blank final variable can be static also which will be initialized in the static block only.
public class Final {
    public static void main(String[] args) {
        new Bike10();
        System.out.println("");
        System.out.println(A1.data);
    }
}
// 1) If you make any variable as final, you cannot change the value of final variable(It will be constant).
class Bike{
    final int speedlimit=90;//final variable
    final void run(){
//        speedlimit=400; // error
    }
}

// 2) If you make any method as final, you cannot override it.
class Honda extends Bike{
//    void run(){  - error
//    System.out.println("running safely with 100kmph");
//    }
}

// 3)  If you make any class as final, you cannot extend it.
final class Biek {}
//class Honad extends Biek{} - error

// 4) Blank final variable
class Bike10{
    final int speedlimit;//blank final variable

    Bike10(){
        speedlimit=70;
        System.out.println(speedlimit);
    }
}

// 5) Static final variable
// A static final variable that is not initialized at the time of declaration is known as static blank final variable.
// It can be initialized only in static block.
class A1{
    static final int data;//static blank final variable
    static {
        data=50;
    }
}
// Summary
//  If you declare any parameter as final, you cannot change the value of it.