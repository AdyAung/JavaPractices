package FirstLearningMaterials;

public class StudentGPA {
    double gpa;

    public StudentGPA(double initialGpa){
        this.gpa = initialGpa;
    }

    //Check GPA
    public void currentGpa(){
        System.out.println("Hi!");
        System.out.println("My current GPA is " + gpa);
    }

    //Add GPA after Exam
    public double afterExamResult(double addGPA){
        double totalGPA = gpa + addGPA;
        gpa = totalGPA;
        System.out.println("I got this much " + addGPA + " in the last exam.");
        return addGPA;
    }

    //bad GPA
    public double badResult(double substractGPA){
        double badGPA = gpa - substractGPA;
        gpa = badGPA;
        System.out.println("I got this " + gpa + " after I did bad in another exam..");
        return substractGPA;
    }

    public static void main(String[] args){
        StudentGPA ady = new StudentGPA(4.0);

        ady.currentGpa();
        ady.afterExamResult(1.5);
        ady.badResult(2.0);
        System.out.println("Now my GPA is " + ady.gpa);
    }
}
