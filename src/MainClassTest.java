import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass number = new MainClass();
        int result = number.getLocalNumber();
        Assert.assertTrue("getLocalNumber is not 14", result == 14);
    }
}
