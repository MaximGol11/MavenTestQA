import org.testng.Assert;
import org.testng.annotations.Test;

public class MainUnitTest {

    @Test
    void testGetSum() {
        int result;

        result = Main.getSum(2, 2);
        Assert.assertEquals(result, 4);

        result = Main.getSum(-2, 1);
        Assert.assertEquals(result, -1);

        result = Main.getSum(0, 0);
        Assert.assertEquals(result, 0);
    }

    @Test
    void testGetSub() {
        int result;

        result = Main.getSub(10, 4);
        Assert.assertEquals(result, 6);

        result = Main.getSub(0, 10);
        Assert.assertEquals(result, -10);

        result = Main.getSub(-10, 10);
        Assert.assertEquals(result, -20);

        result = Main.getSub(10, -10);
        Assert.assertEquals(result, 20);
    }

    @Test
    void testGetMultiple() {
        int result;

        result = Main.getMultple(10, 2);
        Assert.assertEquals(result, 20);

        result = Main.getMultple(5, -5);
        Assert.assertEquals(result, -25);

        result = Main.getMultple(0, 25);
        Assert.assertEquals(result, 0);

        result = Main.getMultple(1, 50);
        Assert.assertEquals(result, 50);
    }

    @Test
    void testGetDiv() {
        double result;

        result = Main.getDiv(20.0, 2.0);
        Assert.assertEquals(result, 10.0);

        result = Main.getDiv(0, 5);
        Assert.assertEquals(result, 0);


    }
}
