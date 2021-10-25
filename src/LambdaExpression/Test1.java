package LambdaExpression;

import textio.TextIO;

interface nameLambda{
    String get();

}

public class Test1 {
    public static void main(String[] args) {
        nameLambda ady = () -> {
            TextIO.put("Name Pls: ");
            return TextIO.getln();
        };
        System.out.println("His name is: " + ady.get());

    }
}
