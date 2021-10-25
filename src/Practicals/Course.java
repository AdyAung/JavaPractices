package Practicals;

public class Course {
    public static void main(String[] args) {
        String course = "Information Technology";
        switch (course){
            case "History":
                System.out.println("Enrolled in History");
                break;

            case "Information Technology":
                System.out.println("Enrolled in BIT");
                break;

            default:
                System.out.println("Course not found!");
        }
    }
}