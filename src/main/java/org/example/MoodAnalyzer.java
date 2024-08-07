package org.example;
//package org.MoodAnalyser;
import java.util.Objects;

import java.util.Objects;

public class MoodAnalyzer {
    private String message;

    public enum Mood {
        HAPPY, SAD, EMPTY
    }

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        if (Objects.isNull(message) || message.trim().isEmpty()) {
            throw new MoodAnalysisException(Mood.EMPTY.toString());
        }
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        Objects.requireNonNull(message, "Message cannot be null");
        message = message.toLowerCase();
        if (message.contains("sad")) {
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        } else {
            return "";
        }
    }
}

