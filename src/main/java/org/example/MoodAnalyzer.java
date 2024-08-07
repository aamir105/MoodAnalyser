package org.example;
//package org.MoodAnalyser;
import java.util.Objects;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer()
    {

    }

    public MoodAnalyzer(String message)
    {
            this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try{
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
        catch (NullPointerException e){
            throw new MoodAnalysisException("Message cannot be null");
        }
    }
}
