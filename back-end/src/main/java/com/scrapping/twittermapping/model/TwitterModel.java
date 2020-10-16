package com.scrapping.twittermapping.model;

public class TwitterModel {
    private String Text;
    private String CreatedAt;
    private String Language;
    private String User;
    private String Location;
    private Boolean GeoEnabled;

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Boolean getGeoEnabled() {
        return GeoEnabled;
    }

    public void setGeoEnabled(Boolean geoEnabled) {
        GeoEnabled = geoEnabled;
    }
}
