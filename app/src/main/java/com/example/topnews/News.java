package com.example.topnews;

public class News {

    private String usernane;
    private  String feedback;


    public News() {
    }


    public News(String usernane, String feedback) {
        this.usernane = usernane;
        this.feedback = feedback;
    }

    public String getUsernane() {
        return usernane;
    }

    public void setUsernane(String usernane) {
        this.usernane = usernane;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
