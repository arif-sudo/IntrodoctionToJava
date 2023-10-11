package Eolymp.Strings;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Main7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String n = scanner.nextLine().trim();
            String m = scanner.nextLine().trim();

            String n1 = n.toLowerCase();
            String m1 = m.toLowerCase();

            System.out.println(areAnagrams(n1, m1) ? "YES" : "NO");

        }
        public static boolean areAnagrams(String w1, String w2){
            if (w1.length() != w2.length()){
                return false;
            }
            char[] arr1 = w1.toCharArray();
            char[] arr2 = w2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
    }
