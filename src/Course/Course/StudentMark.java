package Course;

public class StudentMark {
    public static void main(String[] args) {
        // marks for DBM, C, and Bible Doctrine & Philosophy
        int dbm = 14;
        int c = 9;
        int bibleDoctrine = 18;
        int Philosophy = 17;

        // Find the lowest mark
        int lowestMark = 13;

        // Display the lowest mark only if it's below 13
        if (dbm < lowestMark) {
            lowestMark = dbm;
        }
        if (c < lowestMark) {
            lowestMark = c;
        }
        if (bibleDoctrine < lowestMark) {
            lowestMark = bibleDoctrine;
        }
        if (Philosophy < lowestMark) {
            lowestMark = Philosophy;
        }
        if (lowestMark < 13) {
            System.out.println("The lowest mark below 13 is: " + lowestMark);
        } else {
            System.out.println("No marks below 13.");
        }
    }
}

