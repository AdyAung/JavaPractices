package TwoDimensionalArrays;

public class Test6 {
    public static void main(String[] args) {
        char[][] charData = {{'a', 'b', 'c', 'd', 'e', 'f'},
                {'g', 'h', 'i', 'j', 'k', 'l'}};

        for(int i = 0; i < charData.length; i++){
            for(int j = 0; j < charData[0].length; j++){
                System.out.println(charData[i][j] + " ");
            }
        }
        System.out.println();
    }
}
