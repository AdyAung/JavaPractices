package ArrayLists;
import java.util.Arrays;

public class NewsFeed {

    String[] topics = {"Opinion", "Tech", "Science"};
    int[] views = {0,0,0};

    public NewsFeed(){

    }

    public void viewTopics(int index){
        views[index] += 1;

    }




    public static void main(String[] args) {
        NewsFeed news = new NewsFeed();

        news.viewTopics(1);
        news.viewTopics(2);

        System.out.println(news.views[1] + " times");







    }
}
