import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class BabySitterCalculatorTest {

    private Object BabySitterCalculator;
    BabySitterCalculations testCalculator;

    @Before
    public void setup() {
        testCalculator = new BabySitterCalculations();
    }

    @Test
    public void Test_Family_A_Calculations() {
        assertEquals(190, testCalculator.Family_A_Calculations(17, 28));
        assertEquals(75, testCalculator.Family_A_Calculations(22, 26));
        assertEquals(75, testCalculator.Family_A_Calculations(17, 22));
        assertEquals(60, testCalculator.Family_A_Calculations(24, 27));
        assertEquals(90, testCalculator.Family_A_Calculations(17, 23));
    }

    @Test
    public void Test_Family_B_Calculations() {
        assertEquals(140, testCalculator.Family_B_Calculations(17, 28));
        assertEquals(48, testCalculator.Family_B_Calculations(22, 26));
        assertEquals(60, testCalculator.Family_B_Calculations(17, 22));
        assertEquals(48, testCalculator.Family_B_Calculations(24, 27));
        assertEquals(68, testCalculator.Family_B_Calculations(17, 23));
        assertEquals(44, testCalculator.Family_B_Calculations(19, 23));
    }

    @Test
    public void Test_Family_C_Calculations() {
        assertEquals(189, testCalculator.Family_C_Calculations(17, 28));
        assertEquals(60, testCalculator.Family_C_Calculations(22, 26));
        assertEquals(99, testCalculator.Family_C_Calculations(17, 22));
        assertEquals(45, testCalculator.Family_C_Calculations(24, 27));
        assertEquals(114, testCalculator.Family_C_Calculations(17, 23));
        assertEquals(72, testCalculator.Family_C_Calculations(19, 23));
    }
}