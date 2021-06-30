package com.moodanalyser;

public class MoodAnalyser  {
    private String message;

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Please enter proper message");
        }
    }

    public MoodAnalyser() {}

    public MoodAnalyser(String message) {
        this.message = message;
    }
}
