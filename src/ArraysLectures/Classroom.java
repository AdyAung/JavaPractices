package ArraysLectures;
import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        String[] students = new String[4];

        students[0] = "Sade";
        students[1] = "Alexus";
        students[2] = "Sam";
        students[3] = "Koma";

        System.out.println(Arrays.toString(students));

        double[] mathScores = new double[4];

        mathScores[0] = 94.5;
        mathScores[2] = 76.8;

        System.out.println("The number of students in the class is " + students.length + " students");

    }
}
