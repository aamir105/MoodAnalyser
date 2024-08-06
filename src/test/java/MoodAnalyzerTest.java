import org.junit.Assert;
import org.example.MoodAnalyzer;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void result1(){
        MoodAnalyzer mood1 = new MoodAnalyzer();
        String result = mood1.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD",result);
    }

    @Test
    public void result2(){
        MoodAnalyzer mood1 = new MoodAnalyzer();
        String result = mood1.analyseMood("I am in happy mood");
        Assert.assertEquals("HAPPY",result);
    }
    public static void main(String[] args) {

    }

}
