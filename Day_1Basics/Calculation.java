import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int n = sc.nextInt();

            System.out.print("Enter second integer: ");
            int m = sc.nextInt();

            int sum = n + m;
            int sub = n - m;
            int mul = n * m;
            int div = n / m;
            int remainder = n % m;

            System.out.println("The sum is " + (sum));
            System.out.println("The sub is " + (sub));
            System.out.println("The mul is " + (mul));
            System.out.println("The div is " + (div));
            System.out.println("The remeinder is " + (remainder));
            sc.close();
    }
    
}
