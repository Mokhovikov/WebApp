package com.Spring.WebApp.Models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Post  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;

    private String title, preview, full_text;
    private int views;

    public Post() {
    }

    public Post(String title, String preview, String full_text) {
        this.title = title;
        this.preview = preview;
        this.full_text = full_text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
