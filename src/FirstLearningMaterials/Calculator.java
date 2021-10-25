package FirstLearningMaterials;

public class Calculator {
    //Constructor Method
    public Calculator(){

    }

    //Return add method
    public int add(int a, int b){
        int result = a + b;
        return result;
    }

    //Return Subtract Method
    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    //Return Multiply Method
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    //Return Divide Method
    public int divide(int a, int b){
        int result = a / b;
        return result;
    }

    //Return Modulo Method
    public int modulo(int a, int b){
        int result = a % b;
        return result;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println("Welcome To The World Of Calculation!");
        System.out.println("Adding method: " + myCalculator.add(4,5));
        System.out.println("Subtracting method: " + myCalculator.subtract(10, 4));
        System.out.println("Dividing method: " + myCalculator.divide(8, 4));
        System.out.println("Multiply method: " + myCalculator.multiply(3, 3));
        System.out.println("Modulo method: " + myCalculator.modulo(9, 3));

    }

}
