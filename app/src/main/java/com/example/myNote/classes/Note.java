package com.example.mynote.classes;

public class Note {
    private int image;
    private String Title;
    private String subTitle;
    private String content;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Note(int image, String title, String subTitle, String content) {
        this.image = image;
        Title = title;
        this.subTitle = subTitle;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
