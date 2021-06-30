package com.moodanalyser;

public class MoodAnalyser {
    private String message;
    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }

    public MoodAnalyser() {}

    public MoodAnalyser(String message) {
        this.message = message;
    }
}
