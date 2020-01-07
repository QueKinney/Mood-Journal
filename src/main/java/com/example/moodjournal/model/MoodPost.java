package com.example.moodjournal.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class MoodPost {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int rating;

    private Date date;

    @NotNull
    @Size(min = 1)
    private String blog;

    public MoodPost(String blog, int rating, Date date) {
        this.blog = blog;
        this.rating = rating;
        this.date = new Date();
    }

    public MoodPost(){}

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public int getId() {
        return id;
    }
}