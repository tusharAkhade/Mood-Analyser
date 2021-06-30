package com.moodanalyser;

/**
 * This is user defined checked(compile-time) Exception
 */
public class MoodAnalysisException extends Exception {
    public MoodAnalysisException(String message) {
        super(message);
    }
}
