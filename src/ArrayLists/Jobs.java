package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Jobs {
    public static void main(String[] args) {
        ArrayList<String> jobLists = new ArrayList<String>();

        String firstJob = "Software Developer";
        String secondJob = "Data Scientist";


        jobLists.add(secondJob);
        jobLists.add(1, "Data Anaylyst");
        jobLists.add(2, "Front End Developer");

        System.out.println("Before reverse: " + jobLists);

        Collections.reverse(jobLists);
        System.out.println("After reverse: " + jobLists);

        ArrayList iphone = new ArrayList<>();

        iphone.add("Iphone x");
        iphone.add(1100);
        iphone.add("OS version");

        System.out.println(iphone);

        System.out.println(jobLists.size());
        System.out.println(iphone.size());

        System.out.println(jobLists);

        jobLists.remove(1);

        System.out.println(jobLists);


    }
}

