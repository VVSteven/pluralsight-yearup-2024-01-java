import java.util.Random;

public class MathApplication {
    public static void main(String[] args) {
        //Question 1:
        System.out.println("Answer 1");
        //declare variable here
        int bobSalary = 120000;
        int garySalary = 60000;

        //then code solution
        int highestSalary = Math.max(bobSalary, garySalary);

        //then use System.out.println() to print display results
        System.out.println("The highest salary is " + highestSalary);

        System.out.println("Answer 2");
        int carPrice = 20000;
        int truckPrice = 30000;

        int cheapCar = Math.min(carPrice, truckPrice);

        System.out.println("The cheapest car is " + cheapCar);

        System.out.println("Answer 3");
        float circleRadius = 7.25f;
        double areaCircle = Math.PI * circleRadius;

        System.out.println("The area of a circle with a radius of " + circleRadius + " is " + areaCircle );

        System.out.println("Answer 4");
        double number4 = 25.0;
        double squareRoot = Math.sqrt(number4);

        System.out.println("Square root of " + number4 + " is " + squareRoot);

        System.out.println("Answer 5");
        int x1 = 5;
        int x2 = 10;
        int y1 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.println("The distance between (" + x1 + "," + x2 + ") and (" + y1 + "," + y2 + ") is " + distance);

        System.out.println("Answer 6");
        double number6 = -3.8;
        double absoluteValue = Math.abs(number6);

        System.out.println("The absolute value of " + number6 + " is " + absoluteValue);

        System.out.println("Answer 7");
        Random randomGen = new Random();
        int minNum = 0;
        int maxNum = 1;
        double randomNumber = minNum + (maxNum - minNum) * randomGen.nextDouble();
        System.out.println("A random number between " + minNum + " and " + maxNum + " is " + randomNumber);

    }
}
