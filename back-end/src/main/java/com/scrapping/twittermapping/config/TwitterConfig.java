package com.scrapping.twittermapping.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
@PropertySource("classpath:application.properties")
public class TwitterConfig {
    @Value( "${spring.social.twitter.appId}" )
    private String appId;
    @Value( "${spring.social.twitter.appSecret}" )
    private String appSecret;
    @Value( "${twitter.access.token}" )
    private String token;
    @Value( "${twitter.access.token.secret}" )
    private String secret;

    public TwitterTemplate getTwitterTemplate()
    {
        return  new TwitterTemplate(appId, appSecret, token, secret);
    }


}
