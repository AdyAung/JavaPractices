package ArraysLectures;
import java.util.Arrays;

public class dotaCharacters {

    String[] characters;

    public dotaCharacters(){
        characters = new String[10];
    }

    public void addCharacters(int number, String name){
        characters[number] = name;
    }

    public static void main(String[] args) {
        dotaCharacters firstOne = new dotaCharacters();

        firstOne.addCharacters(0, "Jugger");
        firstOne.addCharacters(1, "Anti Mage");
        firstOne.addCharacters(2, "Monkey King");



        System.out.println(Arrays.toString(firstOne.characters));
        System.out.println("My favorite one is " + firstOne.characters[0]);
    }


}
