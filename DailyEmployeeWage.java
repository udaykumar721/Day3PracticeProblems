import java.util.Scanner;

public class DailyEmployeeWage {
    public static void main(String[] args) {
        Scanner employeeWage = new Scanner(System.in);
        System.out.println("Enter The 1-Full Time Any Other- Part Time ");
        int Is_Full_Time = 1;
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = employeeWage.nextInt();
        if (empCheck == Is_Full_Time)
        {
            empHrs = 8;
        }
        else
        {
            empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Employee Wage Is :" +empWage);
        System.out.println();
    }
}
