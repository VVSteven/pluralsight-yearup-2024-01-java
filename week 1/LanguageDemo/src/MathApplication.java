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

    }
}
