package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Ability to analyse and respond Happy or Sad Mood
 * @author Tushar Akhade
 * @since 30 Jun 2021
 */
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmptyMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
//            e.printStackTrace();
            System.out.println(e);
        }
    }
}
