package Eolymp.JavaOOP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    import java.util.Scanner;
    //import java.util.Scanner;

    public class Main520 {
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
              while (scan.hasNextLine()){
                  if (scan.hasNextInt()){
                      int k = scan.nextInt();
                      System.out.println(k);
                  }else {
                      scan.next();
                  }
    //              System.out.println("while next");
              }

        }
    }
