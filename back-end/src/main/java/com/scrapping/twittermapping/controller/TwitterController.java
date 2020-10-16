package com.scrapping.twittermapping.controller;

import com.scrapping.twittermapping.model.TwitterModel;
import com.scrapping.twittermapping.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class TwitterController {
    @Autowired
    private TwitterService twitterService;

    @RequestMapping(value = "/tweet/{search}/{qty}", method= RequestMethod.GET)
    @ResponseBody
    public List<TwitterModel>  searchTwitter(Model model,
                                             @PathVariable(name = "search") String search,
                                             @PathVariable(name = "qty") int qty) {
        return twitterService.searchTwitter(model,search,qty);
    }

    @RequestMapping(value = "/tweets", method= RequestMethod.GET)
    @ResponseBody
    public List<TwitterModel> getAllTwitters(Model model) {
        return twitterService.searchTwitter(model,"the voice",10);
    }
}