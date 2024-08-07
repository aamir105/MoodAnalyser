import org.example.MoodAnalysisException;
import org.junit.Assert;
import org.example.MoodAnalyzer;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMoodShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenHappyMoodShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test(expected = MoodAnalysisException.class)
    public void givenNullMoodShouldThrowException() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        moodAnalyzer.analyseMood();
    }

    @Test(expected = MoodAnalysisException.class)
    public void givenEmptyMoodShouldThrowException() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        moodAnalyzer.analyseMood();
    }
}

