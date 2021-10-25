package ArraysLectures;

import java.util.Arrays;

public class Newsfeed {
    //instance fields
    String[] trendingArticles;
    int[] views;
    double[] ratings;

    //Constructor Method
    public Newsfeed(String[] initialArticles, int[] initialViews, double[] intitalRatings){
        trendingArticles = initialArticles;
        views = initialViews;
        ratings = intitalRatings;

    }

    //get top article method
    public String getTopArticle(){
        return trendingArticles[0];
    }

    //view article method
    public void viewArticle(int articleNumber){
        views[articleNumber] += 1;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' has been " +
                "viewed " + views[articleNumber] + " times!");

    }

    //ratings method
    public void changeRating(int articleNumber, double newRating){
        if(newRating >5 || newRating < 0){
            System.out.println("The rating must be between 0 and 5 stars!");
        }else{
            ratings[articleNumber] = newRating;
            System.out.println("The article '" + trendingArticles[articleNumber] + " is " +
                    "' now rated " + ratings[articleNumber] + " stars!");
        }
    }

    //Main method
    public static void main(String[] args){
        String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?",
                "Organic Eye Implants", "Path Finding in an Unknown World"};

        int[] robotViewrs = {87, 32, 13, 11, 7};

        double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};

        Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewrs, robotRatings);

        //calling or invoking methods
        robotTimes.viewArticle(4);

        //invoking rating method
        robotTimes.changeRating(0, 4);

        System.out.println("The Top article is " + robotTimes.getTopArticle());
        System.out.println(robotArticles.length);
    }

}