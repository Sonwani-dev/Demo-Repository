import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));

    }

    @Test
    void testSub() {

        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.sub(7, 5));

    }
}