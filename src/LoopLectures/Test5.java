package LoopLectures;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int end = 20;

        for (int i=0; i < end; i++){
            num.add(i);
            if(i > 20){
                continue;
            }
        }

        System.out.println(num);
        int x = 0;
        while(x < num.size()){
            if(num.get(x) % 2 != 0){
                num.remove(x);
            }else {
                x++;
            }
            System.out.println(x);
        }

    }
}
