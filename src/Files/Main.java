package Files;
import java.io.*;
import java.io.File;

// FileReader and FileWriter
// Although internally FileReader uses FileInputStream and FileWriter uses FileOutputStream,
// but here the major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time

public class Main {
    public static void main(String[] args) throws IOException {
        //Example 1
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:/Users/USER/Desktop/input.txt");
            out = new FileOutputStream("C:/Users/USER/Desktop/output.txt");

            int c;
            while ((c = in.read()) != -1) {
//              System.out.println((c)); c is ASCII representative number
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        //Example 2
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                System.out.println(cin);// java.io.InputStreamReader@5fd0d5ae
                cin.close();
            }
        }

        //Example 3
        // As described earlier, a stream can be defined as a sequence of data.
        // The InputStream is used to read data from a source
        // The OutputStream is used for writing data to a destination.

        try {
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }

        // Example 4
        // You use File object to create directories, to list down files available in a directory.
        String dirname = "C:/Users/USER/Desktop/NewDir";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();

        // Example 5
        // You can use list() method provided by File object to list down all the files and directories available in a directory
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("C:/Users/USER/Desktop");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
