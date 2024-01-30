import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Welcome to The Calculator");
        System.out.println("===============================");

        System.out.print("Select first number:");
        double firstNum = Double.parseDouble(scanner.nextLine());

        System.out.print("Select second number:");
        double secondNum = Double.parseDouble(scanner.nextLine());


        System.out.println("Your numbers are " + firstNum + " and " + secondNum);

        System.out.println("===============================");
        System.out.println("Available operations:");
        System.out.println("===============================");

        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter the number corresponding to the desired operation: ");
        String operation = scanner.nextLine();

        double answer = 0.0;

        switch (operation){
            case "1":
                answer = firstNum + secondNum;
                operation = "+";
                break;
            case "2":
                answer = firstNum - secondNum;
                operation = "-";
                break;
            case "3":
                answer = firstNum * secondNum;
                operation = "*";
                break;
            case "4":
                if (secondNum != 0) {
                    answer = firstNum / secondNum;
                    operation = "/";
                } else
                    System.out.println("Can't divide by zero");
                break;
            default:
                System.out.println("Not Available");
                return ;
        }
        System.out.println("Your equation: " + firstNum + " " + operation + " " + secondNum);
        System.out.println("The answer is:" + answer );
    }
}
