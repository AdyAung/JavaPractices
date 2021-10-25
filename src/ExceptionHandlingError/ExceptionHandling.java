package ExceptionHandlingError;

public class ExceptionHandling {
    public static void main(String[] args) {
        int width = 0;
        int length = 40;

        int ratio = length / width;

        System.out.println(ratio);

        try{
            ratio = length / width;

        }catch(ArithmeticException e){
            System.err.println("ArithmeticException: " + e.getMessage());

        }


    }

}
