package ArrayLists;
import textio.TextIO;

import java.util.Arrays;

public class MenuItems {
    public static void main(String[] args) {

        String[] menu = new String[7];

        menu[0] = "Steak";
        menu[1]= "Tacos";
        menu[2] = "Fajita";
        menu[3] = "Magarita";

        System.out.println(Arrays.toString(menu));
        System.out.println(menu[2]);

        String[] favouriteJobs = new String[4];

        TextIO.writeFile("jobList.txt");
        favouriteJobs[0] = "Software Developer";
        favouriteJobs[1] = "Data Scientist";
        favouriteJobs[2] = "Streamers";
        favouriteJobs[3] = "Singer";

        TextIO.putln(Arrays.toString(favouriteJobs));
        TextIO.putln("My favorite first one is " + favouriteJobs[1]);

        System.out.println(Arrays.toString(favouriteJobs));
        System.out.println("My favourite first one is " + favouriteJobs[1]);

        favouriteJobs[2] = "Traveller";

        TextIO.putln(Arrays.toString(favouriteJobs));



    }
}
