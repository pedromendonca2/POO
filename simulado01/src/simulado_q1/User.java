package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String twitterId;
    private List<Tweet> tweets = new LinkedList<>();

    public User(String twitterId) {
        this.twitterId = twitterId;
    }

    public void addTweet(Tweet tweet){
        this.tweets.add(tweet);
    }

    public List<Tweet> getTweets() {
        return new LinkedList<>(this.tweets);
    }
}
