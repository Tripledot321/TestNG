import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    void twoPlusTwoShouldEqualfour(){
        var calculator = new Calculator();
        calculator.add(2,2);
        assertEquals(4,calculator.add(2,2));

    }
}