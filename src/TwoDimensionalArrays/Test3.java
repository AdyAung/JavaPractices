package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[][] data = {{2,4,6}, {8,10,12}, {14,16,18}};


        data[2][2] = 22;
        int store = data[2][2];

        System.out.println(store);
        System.out.println(Arrays.deepToString(data));

        System.out.println(Arrays.toString(data[0]) + Arrays.toString(data[1]) +
                Arrays.toString(data[2]));
    }
}
