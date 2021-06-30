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
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
