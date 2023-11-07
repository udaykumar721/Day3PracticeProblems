import java.util.Scanner;

public class PartTimeWage {
    public static void main(String[] args) {
        Scanner partTime = new Scanner(System.in);
        System.out.println("Enter 1 For Part Time 2 For Full Time");
        int Is_Part_Time = 1;
        int Is_Full_Time = 2;
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = partTime.nextInt();
        if (empCheck == Is_Part_Time)
        {
            empHrs = 4;
        }
        else if (empCheck == Is_Full_Time)
        {
            empHrs = 8;
        }
        else
        {
            empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Emp Wage :" + empWage);
    }
}
