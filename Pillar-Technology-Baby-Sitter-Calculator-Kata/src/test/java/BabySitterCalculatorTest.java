import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class BabySitterCalculatorTest {

    private Object BabySitterCalculator;

    @Test
    public void Test_Calculator_Exists() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("A", BabySitterCalculations.Family_Input("A"));
    }

    @Test
    public void When_Family_Input_Is_A_We_Will_Be_Returned_A() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("A", testCalculator.Family_Input("A"));
    }

    @Test
    public void Test_Calculator_Start_Time_Exists() throws ParseException {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("5:00 pm",testCalculator.Start_Time_Input("5:00 pm"));
        assertEquals("5:00 pm",testCalculator.Start_Time_Input("5:00 pm"));
    }

    @Test
    public void Test_Calculator_End_Time_Exists() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(testCalculator.End_Time_Input());
    }

    @Test
    public void Test_Calculator_Setter_Methods() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(testCalculator.Set_Start_Time());
        assertTrue(testCalculator.Set_End_Time());
    }

    @Test
    public void Test_Calculator_Getter_Methods() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(testCalculator.Get_Start_Time());
        assertTrue(testCalculator.Get_End_Time());

    }
}