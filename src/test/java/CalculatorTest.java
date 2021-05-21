import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    public void calculatorAddTest() {
        Calculator calculator = new Calculator();
        int[] arr = {1, 2, 3, 4, 5};
        //calculator.add(arr);
        assertEquals(15, calculator.getSum());
    }
}