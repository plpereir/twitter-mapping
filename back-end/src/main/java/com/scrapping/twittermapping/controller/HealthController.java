package com.scrapping.twittermapping.controller;

import com.scrapping.twittermapping.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Service
@RequestMapping(value="/api", method = RequestMethod.GET)
public class HealthController {

    @Autowired
    private HealthService healthService;

    @GetMapping(value = "/informations")
    public Map<String, String> getInformations()
    {
        return healthService.getInformations();
    }

    @GetMapping(value = "/helloWorld")
    public Map<String, String> helloWorld()
    {
        return healthService.getInformations();
    }
}
