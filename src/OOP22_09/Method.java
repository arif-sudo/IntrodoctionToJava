package OOP22_09;

public class Method {
        // The method of the class is known as an instance method. It is a non-static method defined in the class
        public static void main(String [] args){
            //Creating an object of the class
            Method obj = new Method();
            System.out.println("The sum is: " + obj.add(12, 13));
        }
        int s;
        //user-defined method because we have not used static keyword
        public int add(int a, int b) {
            s = a+b;
            return s;
        }
}

