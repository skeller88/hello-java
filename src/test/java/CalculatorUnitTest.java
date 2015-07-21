/**
 * Created by skeller on 6/11/15.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.is;

public class CalculatorUnitTest {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void evaluatesInvalidExpressions() {
        Calculator calculator = new Calculator();
        int shouldBeSeven = calculator.returnSeven();
        errorCollector.checkThat("incorrect number 6", 6, is(shouldBeSeven));
        errorCollector.checkThat("incorrect number 8", 8, is(shouldBeSeven));
    }

    @Test
    public void evaluatesValidExpressions() {
        Calculator calculator = new Calculator();
        int shouldBeSeven = calculator.returnSeven();
        errorCollector.checkThat("correct number 7", 7, is(shouldBeSeven));
    }
}
