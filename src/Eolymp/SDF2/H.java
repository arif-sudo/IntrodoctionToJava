package Eolymp.SDF2;
import java.io.IOException;

public class H {
    public static void main(String[] args) {
        try {
            int byteRead;
            int sum = 0;

            while ((byteRead = System.in.read()) != -1) {
                sum += byteRead;
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}