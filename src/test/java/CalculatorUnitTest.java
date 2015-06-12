/**
 * Created by skeller on 6/11/15.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class CalculatorUnitTest {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int shouldBeSeven = calculator.returnSeven();
        assertEquals(7, shouldBeSeven);
    }
}
