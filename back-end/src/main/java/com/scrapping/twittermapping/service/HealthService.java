package com.scrapping.twittermapping.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthService {

    public Map<String, String> getInformations()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("App Informations","Using a hashtag, retrieve the posts and plot the origin of the posts on the map.");
        return map;
    }
}
