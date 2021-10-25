package TwoDimensionalArrays;

public class Test5 {
    public static void main(String[] args) {
        char[][] charData = {{'a', 'b', 'c', 'd', 'e', 'f'},
                {'g', 'h', 'i', 'j', 'k', 'l'}};

        for(char[] charRow : charData){
            for(char c : charRow){
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
