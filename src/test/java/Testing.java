import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    private StringCalculator myCalc;

    @BeforeEach
    public void setUp() {
        myCalc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        myCalc = null;
    }

    @Test
    public void testForExceptionThrownOnNegativeNumber() {
        assertThrows(Exception.class, ()-> myCalc.add("-1,5"));
    }

    @Test
    public void testForIgnoringNumberGreaterThan1000() {
        int result = myCalc.add("1,1000");
        assertEquals(1, result);
    }
}
