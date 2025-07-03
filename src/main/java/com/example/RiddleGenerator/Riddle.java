package com.example.RiddleGenerator;

public class Riddle {
    private String question;
    private String answer;
    private String language;

    public Riddle(String question, String answer, String language) {
        this.question = question;
        this.answer = answer;
        this.language = language;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
} 