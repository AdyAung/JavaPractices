package LoopLectures;

public class Test4 {

    public static boolean checkNumber8(int[] num){
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
            if(num[i]== 8){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(checkNumber8(numbers));

    }
}
