package OOP29_07;

// If subclass has the same method as declared in the parent class, it is known as method overriding in Java.
// Method overriding is used for runtime polymorphism

// Rules for Java Method Overriding
//  The method must have the same name as in the parent class
//  The method must have the same parameter as in the parent class.
//  There must be an IS-A relationship (inheritance).
public class MetodOverriding {
    public static void main(String[] args) {
        System.out.println("Overriding");
        Bike obj = new Bike();
        obj.run();
        System.out.println("");

        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}

class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }
}


class Bank{
    int getRateOfInterest(){return 0;}// <--> instance method
}
//Creating child classes.
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}
class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

// NOTES ***
//  A static method cannot be overridden. It can be proved by runtime polymorphism
// It is because the static method is bound with class whereas instance method is bound with an object.
// Static belongs to the class area, and an instance belongs to the heap area.
// Can we override java main method?
//  No, because the main is a static method.
//