import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BabySitterCalculations {
    static DateFormat time_to_date = new SimpleDateFormat("hh:mm aa");

    public static String Family_Input(String inputString) {
        return inputString;
    }

    public static Date Start_Time_Input(String inputString) throws ParseException {
        Date STime = time_to_date.parse(inputString);
        return STime;
    }

    public boolean End_Time_Input() {
        return true;
    }

    public boolean Set_Start_Time() {
        return true;
    }

    public boolean Set_End_Time() {
        return true;
    }

    public boolean Get_Start_Time() {
        return true;
    }

    public boolean Get_End_Time() {
        return true;
    }

    public boolean Family_A_Calculations() {
        return false;
    }

    public boolean Family_B_Calculations() {
        return true;
    }

    public boolean Family_C_Calculations() {
        return false;
    }
}

