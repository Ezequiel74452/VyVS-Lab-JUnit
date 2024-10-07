import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void additionTest() {
        int result = calculator.addition(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void subtractionTest() {
        int result = calculator.subtraction(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void divideWithYNonZeroTest() {
        int result = calculator.divide(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void divideWithYEqualsZeroTest() {
        int result = calculator.divide(3, 0);
        assertEquals(0, result);
    }

    @Test
    public void multiplyTest() {
        int result = calculator.multiply(3, 2);
        assertEquals(6, result);
    }

    @Test
    public void isEvenTrueTest() {
        boolean result = calculator.isEven(4);
        assertTrue(result);
    }

    @Test
    public void isEvenFalseTest() {
        boolean result = calculator.isEven(5);
        assertFalse(result);
    }
}
