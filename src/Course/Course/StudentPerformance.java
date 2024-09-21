package Course;

public class StudentPerformance {
    public static void main(String[] args) {
        // Example marks for 5 courses
        int course1 = 17;
        int course2 = 14;
        int course3 = 15;
        int course4 = 12;
        int course5 = 18;

        // Calculate the average mark
        double average = (course1 + course2 + course3 + course4 + course5) / 5.0;

        // Display the average
        System.out.println("Average mark: " + average);

        // Determine and display performance status based on the average
        if (average > 16) {
            System.out.println("Distinction");
        } else if (average > 12) {
            System.out.println("Satisfaction");
        } else {
            System.out.println("Failed");
        }
    }
}
