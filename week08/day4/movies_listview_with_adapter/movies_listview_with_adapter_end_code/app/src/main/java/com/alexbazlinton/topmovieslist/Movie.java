package com.alexbazlinton.topmovieslist;

// In order to pass a Movie on an Intent, the class must implement Serializable
// This doesn't enforce any methods

import java.io.Serializable;

public class Movie implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;

    public Movie(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString(){
        return this.getTitle();
    }

}
