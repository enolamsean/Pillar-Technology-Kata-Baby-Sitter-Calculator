import org.junit.Test;

import static org.junit.Assert.*;

public class BabySitterCalculatorTest {

    private Object BabySitterCalculator;

    @Test
    public void Test_Calculator_Exists() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(BabySitterCalculations.Family_Input());
    }
    @Test
    public void Test_Calculator_Start_Time_Exists() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(BabySitterCalculations.Start_Time_Input());
    }
    @Test
    public void Test_Calculator_End_Time_Exists() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(BabySitterCalculations.End_Time_Input());
    }
}