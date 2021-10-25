package ArraysLectures;
import java.util.Arrays;

public class BestNewsFeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] values = {0,0,0,0};
    String[] favoriteArticles;

    public BestNewsFeed(){
         favoriteArticles = new String[10];

    }

    public void setFavoriteArticles(int favoriteIndex, String newArticle){
        favoriteArticles[favoriteIndex] = newArticle;

    }

    public static void main(String[] args) {
        BestNewsFeed sampleFeed = new BestNewsFeed();

        sampleFeed.setFavoriteArticles(2, "Human");
        sampleFeed.setFavoriteArticles(3, "Organic");
        sampleFeed.setFavoriteArticles(0, "Oil News");
        sampleFeed.setFavoriteArticles(1, "Tech");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}