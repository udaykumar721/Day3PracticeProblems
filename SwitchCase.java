import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Salary Of the Employee");
        int empSalary = scanner.nextInt();
        System.out.println("Enter EmployeeRating 1- Full Salary Bonus 2 - Half Salary Bonus 3 - Quarter Salary Bonus 4 - No Salary Bonus");
        int empRate = scanner.nextInt();
        double empBonus;

        switch (empRate){
            case 1:
                empBonus = 1.0 * empSalary;
                System.out.println("Employee Bonus Is :" + empBonus);
                break;
            case 2:
                empBonus = 0.5 * empSalary;
                System.out.println("Employee Bonus Is :" + empBonus);
                break;
            case 3:
                empBonus = 0.25 * empSalary;
                System.out.println("Employee Bonus Is :" + empBonus);
                break;
            default:
                System.out.println("NO Bonus For The Employee");
        }
    }
}
