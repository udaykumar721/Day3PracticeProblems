import java.util.Scanner;
public class WagesForMonth {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                int workingDaysPerMonth = 20;
                double dailyWage = hourlyRate * 8;
                double totalWages = dailyWage * workingDaysPerMonth;
                System.out.println("Total wages for the month: " + totalWages);
    }
}
