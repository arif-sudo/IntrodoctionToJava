package ControlFlow20_09;

public class Control {
    public static void main(String[] args) {
        //  if statement
        int x = 10;
        int y = 12;
        if(x+y > 20) {
            System.out.println("x + y is greater than 20");
        }

        // if else statement
        x = 10;
        y = 12;
        if (x + y >= 10) {
            System.out.println("x + y is greater than 20");
        } else {
            System.out.println("x + y is less than 10");
        }

        // if-else-if statement
        String city = "Delhi";
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println(city);
        }

        // switch statement
        // The case variables can be int, short, byte, char, or enumeration.
        // String type is also supported since version 7 of Java
        // Cases cannot be duplicate
        // Break statement terminates the switch block when the condition is satisfied.
        // It is optional, if not used, next case is executed.
        int num = 2;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

        // for loop
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        // for-each loop
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for (String name:names) {
            System.out.println(name);
        }

        // while loop
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while(i<=10) {
            System.out.println(i);
            i = i + 2;
        }

        // do while loop
        i = 0;
        System.out.println("Printing the list of first 20 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        }while(i<=20);

        // break statement
        // a, b and c are labels ***
        a:
        for(i = 0; i<= 10; i++) {
            b:
            for(int j = 0; j<=15;j++) {
                c:
                for (int k = 0; k<=20; k++) {
                    System.out.println(k);
                    if(k==5) {
                        break a;
                    }
                }
            }

        }
    }
}


