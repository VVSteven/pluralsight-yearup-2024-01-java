import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("============================");

        System.out.print("Enter Numbers of Hours Worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine());
        System.out.println("============================");

        System.out.print("Enter Your Hourly Pay Rate: ");
        double payRate = Double.parseDouble(scanner.nextLine());
        System.out.println("============================");

        double grossPay = payRate * hoursWorked;

        System.out.println("Your Name is " + name);
        System.out.println("You Worked " + hoursWorked + " Hours");
        System.out.println("Your Pay Rate is " +  payRate + " an Hour");
        System.out.println("You Made " + grossPay + " Dollars");
    }
}
