package com.example.recyclerviewtestapplication;

public class EntityNews {

    String headline, thumb, country;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public EntityNews(String headline, String thumb, String country) {
        this.headline = headline;
        this.thumb = thumb;
        this.country = country;
    }
}
