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
    public void When_Family_Input_Is_B_Then_B_Will_Be_Returned() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("B", BabySitterCalculations.Family_Input("B"));
    }

    @Test
    public void When_Family_Input_Is_C_Then_C_Will_Be_Returned() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("C", BabySitterCalculations.Family_Input("C"));
    }

    @Test
    public void When_Family_Input_Is_A_Then_A_Will_Be_Returned() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("A", testCalculator.Family_Input("A"));

    }

    @Test
    public void When_Family_Input_Is_D_Return_Error() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("Error - Please enter family A, B, or C.", testCalculator.Family_Input("d"));
    }

    @Test
    public void When_Family_Input_Is_Number_Return_Error() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("Error - Please enter family A, B, or C.", testCalculator.Family_Input("2"));
    }


    @Test
    public void If_Start_Time_Input_Earlier_Than_Five_PM_Return_Error() throws ParseException {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("5:00 pm", testCalculator.Start_Time_Input("5:00 pm"));
        assertEquals("Error - Baby sitter can only work between 5:00 pm and 4:00 am", testCalculator.Start_Time_Input("4:00 pm"));
    }

    @Test
    public void If_End_Time_Input_Later_Than_Four_AM_Return_Error() throws ParseException {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("3:00 am", testCalculator.End_Time_Input("3:00 am"));
        assertEquals("Error - Baby sitter can only work between 5:00 pm and 4:00 am", testCalculator.End_Time_Input("5:00 am"));
    }

    @Test
    public void If_Start_Or_End_Time_Input_Is_Incorrect_Format_Throw_Error_Message() throws ParseException {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals("Error - please enter a time in numeric HH:MM am/pm format", testCalculator.Start_Time_Input("five o'clock"));
        assertEquals("Error - please enter a time in numeric HH:MM am/pm format", testCalculator.End_Time_Input("3:00"));
    }


  /*  @Test
    public void Test_Calculator_Setter_Methods() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertEquals(17, testCalculator.Set_Start_Time());
        assertTrue(testCalculator.Set_End_Time());
    }

    @Test
    public void Test_Calculator_Getter_Methods() {
        BabySitterCalculations testCalculator = new BabySitterCalculations();
        assertTrue(testCalculator.Get_Start_Time());
        assertTrue(testCalculator.Get_End_Time());

    }*/
}