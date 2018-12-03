import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BabySitterCalculations {
    //Declaring variables
    int startTime, endTime;
    double pay;
    String Family, startTimeString, endTimeString;
    DateFormat time_to_date = new SimpleDateFormat("hh:mm aa");
    Scanner input = new Scanner(System.in);


    public void Family_Input() {
        do {
            System.out.print("Enter the family: ");
            Family = input.nextLine();
            if (!Family.equalsIgnoreCase("A") && !Family.equalsIgnoreCase("B") && !Family.equalsIgnoreCase("C")) {
                System.out.print("Error - Please enter family A, B, or C.");
            }
        } while (!Family.equalsIgnoreCase("A") && !Family.equalsIgnoreCase("B") && !Family.equalsIgnoreCase("C"));
    }

    public void Start_Time_Input() throws ParseException {
        do {
            try {
                System.out.print("Enter the start time (HH:MM am): ");
                startTimeString = input.nextLine();
                Date STime = time_to_date.parse(startTimeString);
                Set_Start_Time(STime);
                if (STime.equals(time_to_date) || Get_Start_Time() < 17 || Get_Start_Time() > 28) {
                    System.out.println("Error - Baby sitter can only work between 5:00 pm and 4:00 am");
                }
            } catch (ParseException e) {
                System.out.println("Error - please enter a time in numeric HH:MM am/pm format");
            }
        } while (Get_Start_Time() < 17 || Get_Start_Time() > 28);
    }

    public void End_Time_Input() throws ParseException {
        do {
            try {
                System.out.print("Enter the end time (HH:MM am): ");
                endTimeString = input.nextLine();
                Date ETime = time_to_date.parse(endTimeString);
                Set_End_Time(ETime);
                if (ETime.equals(time_to_date) || Get_End_Time() < 17 || Get_End_Time() > 28) {
                    System.out.print("Error - Baby sitter can only work between 5:00 pm and 4:00 am");
                }
            } catch (ParseException e) {
                System.out.print("Error - please enter a time in numeric HH:MM am/pm format");
            }
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

    public String Get_Family() {
        return Family;
    }

    public double Family_A_Calculations(int startTime, int endTime) {
        if (endTime <= 23) {
            pay = (endTime - startTime) * 15;

        } else if (startTime < 23 && endTime > 23) {
            pay = ((23 - startTime) * 15) + ((endTime - 23) * 20);
        } else if (startTime > 23 && endTime > 23) {
            pay = (endTime - startTime) * 20;

        }
        return pay;
    }


    public double Family_B_Calculations(int startTime, int endTime) {
        if (endTime <= 22) {
            pay = (endTime - startTime) * 12;
        } else if (startTime < 22 && endTime > 22) {
            pay = ((22 - startTime) * 12) + 16 + ((endTime - 24) * 16);
            if (endTime > 22 && endTime < 24) {
                pay = ((22 - startTime) * 12) + ((24 - endTime) * 8);
            }
        } else if (startTime >= 22 && endTime < 24) {
            pay = ((startTime - 22) * 8) + ((endTime - 22) * 8);
        } else if (startTime >= 22 && endTime > 24) {
            pay = ((24 - startTime) * 8) + ((endTime - 24) * 16);
            if (startTime >= 24) {
                pay = (endTime - startTime) * 16;
            }
        } else if (startTime < 22 && endTime < 24) {
            pay = ((22 - startTime) * 12) + ((24 - endTime) * 8);
        }
        return pay;
    }


    public double Family_C_Calculations(int startTime, int endTime) {
        if (endTime <= 21) {
            pay = (endTime - startTime) * 21;
        } else if (endTime >= 21 && startTime >= 21) {
            pay = (endTime - startTime) * 15;
        } else if (startTime < 21 && endTime >= 21) {
            pay = ((21 - startTime) * 21) + ((endTime - 21) * 15);
        }
        return pay;
    }

    public void output(double pay){
        DecimalFormat dollars = new DecimalFormat("$##,###.00");
        System.out.println("The total for the amount owed is: " + dollars.format(pay));
        /*return"The total for the amount owed is: " + dollars.format(pay);*/
    }

}

