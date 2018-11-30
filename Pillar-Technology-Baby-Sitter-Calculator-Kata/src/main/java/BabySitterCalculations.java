import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BabySitterCalculations {
    //Declaring variables
    int startTime, endTime;
    static DateFormat time_to_date = new SimpleDateFormat("hh:mm aa");

    public static String Family_Input(String inputString) {
        String Family = inputString;
        if (!Family.equalsIgnoreCase("A") && !Family.equalsIgnoreCase("B") && !Family.equalsIgnoreCase("C")) {
            return "Error - Please enter family A, B, or C.";
        }
        return inputString;
    }

    public String Start_Time_Input(String inputString) throws ParseException {
        do {
            try {
                Date STime = time_to_date.parse(inputString);
                Set_Start_Time(STime);
                if (STime.equals(time_to_date) || Get_Start_Time() < 17 || Get_Start_Time() > 28) {
                    return "Error - Baby sitter can only work between 5:00 pm and 4:00 am";
                }
            } catch (ParseException e) {
                return "Error - please enter a time in numeric HH:MM am/pm format";
            }
            return inputString;
        } while (Get_Start_Time() < 17 || Get_Start_Time() > 28);
    }

    public String End_Time_Input(String InputString) throws ParseException {
        do {
            try {
                Date ETime = time_to_date.parse(InputString);
                Set_End_Time(ETime);
                if (ETime.equals(time_to_date) || Get_End_Time() < 17 || Get_End_Time() > 28) {
                    return "Error - Baby sitter can only work between 5:00 pm and 4:00 am";
                }
            } catch (ParseException e) {
                return "Error - please enter a time in numeric HH:MM am/pm format";
            }
            return InputString;
        } while (Get_End_Time() < 17 || Get_End_Time() > 28);
    }


    public void Set_Start_Time(Date STime) {
        int storageStartTime = (((((int) STime.getTime()) / 1000) / 60) / 60) - 5;
        if (storageStartTime < 4) {
            startTime = (storageStartTime + 24);
        } else {
            startTime = (storageStartTime);
        }
    }

    public void Set_End_Time(Date ETime) {
        int storageEndTime = (((((int) ETime.getTime()) / 1000) / 60) / 60) - 5;
        if (storageEndTime <= 4) {
            endTime = (storageEndTime + 24);
        } else {
            endTime = storageEndTime;
        }
    }


    public int Get_Start_Time() {
        return startTime;
    }

    public int Get_End_Time() {
        return endTime;
    }

    public int Family_A_Calculations( int startTime, int endTime) {
        int pay = 0;
        if (endTime <= 23) {
            pay = (endTime - startTime) * 15;

        } else if (startTime < 23 && endTime > 23) {
            pay = ((23 - startTime) * 15) + ((endTime - 23) * 20);
        } else if (startTime > 23 && endTime > 23) {
            pay = (endTime - startTime) * 20;

        }
        return pay;
    }


    public int Family_B_Calculations() {
    }

    public int Family_C_Calculations() {
    }
}

