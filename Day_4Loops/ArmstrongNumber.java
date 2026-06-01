package Day_4Loops;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Is Armstrong number");
        }

        else {
            System.out.println("Is not an Armstrong number");

        }

        sc.close();
    }

    
}
