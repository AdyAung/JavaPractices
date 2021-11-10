package TestingExamples;
import java.util.Arrays;

public class CheckWardrobe {

    public static boolean checkWardrobe(String[] list){
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
            if(list[i] == "jacket"){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String[] wardrobe = {"shirt", "jacket", "pants", "socks"};

        System.out.println(checkWardrobe(wardrobe));

    }
}
