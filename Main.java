import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1- Present Others - Absent");
        int Is_Full_Time = 1;
        int empCheck = scanner.nextInt();
        if (empCheck == Is_Full_Time)
        {
            System.out.println("Employee Is Present");
        }
        else
        {
            System.out.println("Employee Is Not Present");
        }
        System.out.println();
    }
}