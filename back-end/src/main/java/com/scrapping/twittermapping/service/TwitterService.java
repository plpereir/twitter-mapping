package com.scrapping.twittermapping.service;

import com.scrapping.twittermapping.config.TwitterConfig;
import com.scrapping.twittermapping.model.TwitterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchParameters;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class TwitterService {
    @Autowired
    private TwitterConfig twitterConfig;

    public List<TwitterModel> searchTwitter(Model model,String search,int qty) {

        SearchResults results = twitterConfig.getTwitterTemplate().searchOperations().search(
                new SearchParameters(search)
                        .resultType(SearchParameters.ResultType.RECENT)
                        .count(qty));

        List<Tweet> tweets = results.getTweets();
        model.addAttribute("tweets", tweets);

        List<TwitterModel> twitterModelList = new ArrayList<TwitterModel>() ;

        for (Tweet tweet : tweets) {
            TwitterModel twitterModel = new TwitterModel();
                twitterModel.setText(tweet.getText());
                twitterModel.setCreatedAt(tweet.getCreatedAt().toString());
                twitterModel.setGeoEnabled(tweet.getUser().isGeoEnabled());
                twitterModel.setLanguage(tweet.getLanguageCode());
                twitterModel.setUser(tweet.getFromUser() );
                twitterModel.setLocation(tweet.getUser().getLocation());
            twitterModelList.add(twitterModel);
        }

        return twitterModelList;
    }

}
