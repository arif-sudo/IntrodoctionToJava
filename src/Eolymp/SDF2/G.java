package Eolymp.SDF2;
import java.util.*;
import java.util.List;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of records
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Map to store subjects and corresponding students
        Map<String, List<String>> subjectMap = new HashMap<>();
        // Map to store students and corresponding subjects
        Map<String, List<String>> studentMap = new HashMap<>();

        // Process input records
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            String subject = tokens[0];
            String student = tokens[1];

            // Update subjectMap
            subjectMap.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);

            // Update studentMap
            studentMap.computeIfAbsent(student, k -> new ArrayList<>()).add(subject);
        }

        // Input number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Process queries
        for (int i = 0; i < q; i++) {
            String query = scanner.nextLine();

            if (subjectMap.containsKey(query)) {
                // Query is a subject, print students in ascending order
                List<String> students = subjectMap.get(query);
                Collections.sort(students);
                System.out.println(String.join(" ", students));
            } else if (studentMap.containsKey(query)) {
                // Query is a student, print subjects in ascending order
                List<String> subjects = studentMap.get(query);
                Collections.sort(subjects);
                System.out.println(String.join(" ", subjects));
            } else {
                // Query not found
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}