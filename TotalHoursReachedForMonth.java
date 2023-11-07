import java.util.Scanner;
public class TotalHoursReachedForMonth {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter the total working hours for the month: ");
                int totalWorkingHours = scanner.nextInt();
                System.out.print("Enter the total working days for the month: ");
                int totalWorkingDays = scanner.nextInt();
                int hoursWorked = 0;
                int daysWorked = 0;
                double totalWages = 0;
                while (hoursWorked < totalWorkingHours && daysWorked < totalWorkingDays) {
                    double dailyWage = hourlyRate * 8;
                    if (hoursWorked + 8 <= totalWorkingHours && daysWorked + 1 <= totalWorkingDays) {
                        totalWages += dailyWage;
                        hoursWorked += 8;
                        daysWorked++;
                    } else {
                        break;
                    }
                }
                System.out.println("Total wages for the month: $" + totalWages);
    }
}

