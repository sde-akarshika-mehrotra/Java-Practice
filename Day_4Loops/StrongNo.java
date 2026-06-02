package Day_4Loops;

import java.util.Scanner;

public class StrongNo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int factorial = 1;
            for ( int i = 1; i <= digit; i++) {
                factorial = factorial*i;
            }

            sum += factorial;
            n = n/10;
        }
        

        if (sum == original) {
            System.out.println("Is a Strong number");
        }

        else {
            System.out.println("Is not a Strong number");

        }

        sc.close();
    }

    
}

    

