package com.moodanalyser;

public class MoodAnalyser {
    private String message;
    public String analyseMood() {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public MoodAnalyser() {}
    
    public MoodAnalyser(String message) {
        this.message = message;
    }
}
