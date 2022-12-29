package test;
import org.junit.Assert;
import org.junit.Test;
import main.services.CalculatorServise;


public class CalculatorTest {
    @Test
    public void multiplyWhenTypeIsInteger() throws Exception {
        Integer[] array1 = new Integer[] { 3, 2 };
        Integer[] array2 = new Integer[] { 4, 5 };
        CalculatorServise<Integer> service = new CalculatorServise<>(array1, array2);
        Integer[] result = service.MultiplyArrays();
        Assert.assertTrue(result[0] == 12);
        Assert.assertTrue(result[1] == 10);
    }
}
