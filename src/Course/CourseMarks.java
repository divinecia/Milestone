package Course;

public class CourseMarks {
    public static void main(String[] args) {
        // Example marks for Java, C, and Web Tech
        int javaMark = 85;
        int cMark = 90;
        int webTechMark = 75;

        // Calculate the average mark
        double average = (javaMark + cMark + webTechMark) / 3.0;

        // Display the average
        System.out.println("Average mark: " + average);

        // Display marks greater than the average
        if (javaMark > average) {
            System.out.println("Java mark (" + javaMark + ") is greater than the average.");
        }
        if (cMark > average) {
            System.out.println("C mark (" + cMark + ") is greater than the average.");
        }
        if (webTechMark > average) {
            System.out.println("Web Tech mark (" + webTechMark + ") is greater than the average.");
        }
    }
}
