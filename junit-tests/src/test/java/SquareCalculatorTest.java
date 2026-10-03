import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.SquareCalculator;

public class SquareCalculatorTest {

    @Test
    public void shouldReturnS() {
        var calculator = new SquareCalculator();
        assertEquals(4, calculator.squareS(2, 2));
    }

    @Test
    public void shouldReturnZero() {
        var calculator = new SquareCalculator();
        assertEquals(0, calculator.squareS(0, 0));
    }
}
