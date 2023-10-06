package Strings06_10;

// The java.lang.String class provides a lot of built-in methods that are used to manipulate string in Java.
// By the help of these methods, we can perform operations on String objects such as trimming, concatenating, converting, comparing, replacing strings etc.

public class Strings {
    public static void main(String[] args) {
        String s="Sachin";
        System.out.println(s.toUpperCase());//SACHIN
        System.out.println(s.toLowerCase());//sachin
        System.out.println(s);//Sachin(no change in original)

        String s2 = "  Sachin  ";
        System.out.println(s2);//  Sachin
        System.out.println(s2.trim());//Sachin

        System.out.println(s.equals(s2.trim())); // case sensetive **
        // s.equalsIgnoreCase() // not case sensetive **

        System.out.println(s.startsWith("Sa"));//true
        System.out.println(s.endsWith("n"));//true

        System.out.println(s.charAt(0));//S
        System.out.println(s.charAt(3));//h
        System.out.println(s.length());//6

        // Java String intern() Method
        // A pool of strings, initially empty, is maintained privately by the class String.
        // When the intern method is invoked, if the pool already contains a String equal to this String object as determined by the equals(Object)
        // method, then the String from the pool is returned.
        // Otherwise, this String object is added to the pool and a reference to this String object is returned.

        String s3 = new String("Sachin");
        String s4 = s3.intern();
        System.out.println(s4);//Sachin

        // Java String valueOf() Method
        // The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
        int a = 10;
        String s5 = String.valueOf(a);
        System.out.println(s5 + 10);// 1010

        String s6 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s6.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);

        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));

        String s7 = "Welcome to Java";
        char[] ch = s7.toCharArray();
        int len = ch.length;
        System.out.println("Char Array length: " + len);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.println(ch[i]);
        }

        String s8="ABCDEFG";
        byte[] barr = s8.getBytes();
        for(int i = 0; i < barr.length;i++){
            System.out.println(barr[i]);
        }


    }
}
