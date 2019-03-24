import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass number = new MainClass();
        int result = number.getLocalNumber();
        Assert.assertTrue("getLocalNumber is not 14", result == 14);
    }

    @Test
    public void testGetClassNumber() {
        MainClass number = new MainClass();
        int result = number.getClassNumber();
        Assert.assertTrue("getClassNumber is lower then 45", result > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass main = new MainClass();
        String result = main.getClassString();
        Assert.assertTrue("getClassString not contains \"Hello\" or \"hello\"", checkStringToHello(result));
    }

    private Boolean checkStringToHello(String result) {
        return result.contains("Hello") || result.contains("hello");
    }
}
