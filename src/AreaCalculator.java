import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Shape Area Calculator");

        while (true){
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();


            System.out.println("Which shape: ");

            int shape = keyboard.nextInt();
            System.out.println();

            if(shape == 1){
                areaTriangle(5,6);
            }else if(shape == 2){
                areaRectangle(4,5);
            }else if(shape == 3){
                areaCircle(4);
            }else{
                quit();
                break;

            }
        }
    }

    public static double areaTriangle(int base, int height){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Base: ");
        base = keyboard.nextInt();

        System.out.println("Height: ");
        height = keyboard.nextInt();
        System.out.println();

        int A = (base * height) / 2;
        System.out.println("The area is " + A + ".");

        return A;
    }

    public static int areaRectangle(int length, int width){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Length: ");
        length = keyboard.nextInt();

        System.out.println("Width: ");
        width = keyboard.nextInt();

        System.out.println();

        int A = length * width;

        System.out.println("The area is " + A + ".");

        return A;


    }

    public static double areaCircle(int radius){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Radius: ");
        radius = keyboard.nextInt();

        System.out.println();

        double A = Math.PI * radius * radius;

        System.out.println("The area is " + A + ".");
        return A;
    }

    public static String quit(){
        System.out.println("Thank You!");
        return null;
    }



}
