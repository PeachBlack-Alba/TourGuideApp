package com.example.android.tourguideapp.Model;

public class Data {
    String name;
    Integer imageUrl;
    String web_search;
    String  location;

    public Data(String name, Integer imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }
// for adding urls for location and web search

    public Data(String name, Integer imageUrl, String web_search, String location) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.web_search = web_search;
        this.location = location;
    }

    public String getWeb_search() {
        return web_search;
    }

    public void setWeb_search(String web_search) {
        this.web_search = web_search;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
