package Day_3Conditionals_2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (+, /, %, power, sqrt): ");
        String operation = sc.next();

        switch (operation) {

            case "+":
                System.out.println("Result = " + (num1 + num2));
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;

            case "%":
                if (num2 == 0) {
                    System.out.println("Cannot perform modulus with zero!");
                } else {
                    System.out.println("Result = " + (num1 % num2));
                }
                break;

            case "power":
                System.out.println("Result = " + Math.pow(num1, num2));
                break;

            case "sqrt":
                if (num1 < 0) {
                    System.out.println("Square root of negative number is not possible!");
                } else {
                    System.out.println("Result = " + Math.sqrt(num1));
                }
                break;

            default:
                System.out.println("Invalid Operation!");
        }

        sc.close();
    }
}

