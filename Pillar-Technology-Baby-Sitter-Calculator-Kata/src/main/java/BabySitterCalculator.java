import java.text.ParseException;

public class BabySitterCalculator {
    public static void main(String[] args) throws ParseException {
        BabySitterCalculations calculator = new BabySitterCalculations();
        String Family;
        int startTime, endTime;
        double pay = 0;
        calculator.Family_Input();
        calculator.Start_Time_Input();
        calculator.End_Time_Input();
        Family = calculator.Get_Family();
        startTime = calculator.Get_Start_Time();
        endTime = calculator.Get_End_Time();

        if (Family.equals("A")) {
            pay = calculator.Family_A_Calculations(startTime, endTime);
        } else if (Family.equals("B")) {
            pay = calculator.Family_B_Calculations(startTime, endTime);
        } else if (Family.equals("C")) { 
            calculator.Family_C_Calculations(startTime, endTime);
        }
        calculator.output(pay);

    }
}
