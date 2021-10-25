package TwoDimensionalArrays;
import java.util.Arrays;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        int[][] subMatrix = new int[2][2];

        int first = subMatrix[0][0] * 5;
        int second = subMatrix[0][1] * 5;
        int third = subMatrix[1][0] * 5;
        int four = subMatrix[1][1] * 5;

        subMatrix[0][0] = first;
        subMatrix[0][1] = second;
        subMatrix[1][0] = third;
        subMatrix[1][1] = four;

        System.out.println(Arrays.deepToString(subMatrix));

        /*
        subMatrix[0][0] = intMatrix[0][0] * 5;
    subMatrix[0][1] = intMatrix[0][1] * 5;
    subMatrix[1][0] = intMatrix[1][0] * 5;
    subMatrix[1][1] = intMatrix[1][1] * 5;

    System.out.println(Arrays.deepToString(subMatrix));
         */


    }
}
