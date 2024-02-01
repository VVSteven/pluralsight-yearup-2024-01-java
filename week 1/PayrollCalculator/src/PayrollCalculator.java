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

        System.out.print("Enter Your Regular Hours: ");
        double regularHours = Double.parseDouble(scanner.nextLine());
        System.out.println("============================");
        scanner.close();

        double overtimePay = 0.0;

        if (hoursWorked > regularHours) {
            double overtime = hoursWorked - regularHours;
            double overtimePayRate = payRate * 1.5;
            overtimePay = overtime * overtimePayRate;
            hoursWorked = hoursWorked - overtime;

        }
        double regularPay = hoursWorked * payRate;
        double grossPay =  regularPay + overtimePay;

        System.out.println("Your Name is " + name);
        System.out.println("You Worked " + hoursWorked + " Hours");
        System.out.println("Your Pay Rate is " + payRate + " an Hour");
        System.out.println("You Made "+ regularPay + " Dollars and " + overtimePay + " Dollars in Overtime");
        System.out.println("Your Gross Pay is " + grossPay + " Dollars");
    }
}
