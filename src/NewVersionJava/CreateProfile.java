package NewVersionJava;

import textio.TextIO;

public class CreateProfile {
    /*
    Name, email, salary, favcolor
     */

    /*
     TextIO.putln("Good Afternoon!  This program will create");
        TextIO.putln("your profile file, if you will just answer");
        TextIO.putln("a few simple questions.");
        TextIO.putln();
     */

    public static void main(String[] args) {
        String name;
        String email;
        double salary;
        String favColor;

        TextIO.putln("Good Afternoon! This program will create");
        TextIO.putln("your profile file, if you will just answer");
        TextIO.putln("a few simple questions.");
        TextIO.putln();

        TextIO.put("What is your name?  ");
        name = TextIO.getln();

        TextIO.put("What is your email? ");
        email = TextIO.getln();

        TextIO.put("How much is your salary? ");
        salary = TextIO.getlnDouble();

        TextIO.put("What is your favourit color? ");
        favColor = TextIO.getln();

        TextIO.writeFile("profile.txt");
        TextIO.putln("Name:             " + name);
        TextIO.putln("Email:            " + email);
        TextIO.putln("Favourite Color:  " + favColor);
        TextIO.putf("Yearly Income: $%,1.2f%n", salary);

        TextIO.writeStandardOutput();
        TextIO.putln("Thank you. Your profile has been written to profile.txt.");










    }
}
