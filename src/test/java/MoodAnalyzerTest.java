import org.example.MoodAnalysisException;
import org.junit.Assert;
import org.example.MoodAnalyzer;
import org.junit.Test;
//import org.MoodAnalyser.MoodAnalyzer;

//
//public class MoodAnalyzerTest {
//
//    @Test
//    public void result1(){
//        MoodAnalyzer mood1 = new MoodAnalyzer();
//        String result = mood1.analyseMood();
//        Assert.assertEquals("HAPPY",result);
//    }
//}

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test(expected = MoodAnalysisException.class)
    public void givenNullMoodShouldThrowException() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        moodAnalyzer.analyseMood();
    }
}
