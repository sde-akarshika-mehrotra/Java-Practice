package Day_4Loops;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i < num; i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        sc.close();

    }

}
