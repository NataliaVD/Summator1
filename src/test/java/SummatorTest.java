import org.junit.Assert;
import org.junit.Test;

public class SummatorTest {

    @Test
    public void testSummatorWithTwoPositiveNumbers(){
        int result = Summator.sum(new int[]{2, 3});
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSummatorWithTwoNegativeNumbers(){
        int result = Summator.sum(new int[]{-29, -30});
        Assert.assertEquals(result, -59);
    }
}