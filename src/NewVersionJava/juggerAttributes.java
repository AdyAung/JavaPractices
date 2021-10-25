package NewVersionJava;

import textio.TextIO;

public class juggerAttributes {
    public static void main(String[] args) {


        TextIO.putln("These below are jugger attributes");
        String name;
        int age;
        String firstLevel;
        String secondLevel;


        TextIO.putln("This character name is ");
        name = TextIO.getln();

        TextIO.putln("This character age is ");
        age = TextIO.getlnInt();

        TextIO.putln("This character first level is ");
        firstLevel = TextIO.getln();

        TextIO.putln("This character second level is ");
        secondLevel = TextIO.getln();

        TextIO.writeFile("juggerData.txt");

        TextIO.putln("Character name    " + name);
        TextIO.putln("Character age     " + age);
        TextIO.putln("Charcter First Level      " + firstLevel);
        TextIO.putln("Character Second Level    " + secondLevel);

        TextIO.readFile("juggerData.txt");

    }
}
