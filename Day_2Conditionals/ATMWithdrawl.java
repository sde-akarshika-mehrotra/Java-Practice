package Day_2Conditionals;

import java.util.Scanner;

public class ATMWithdrawl {

    public static void main(String[] args) {

        int balance = 10000;
        int withdrawal_amount;
        int remaining_balance;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        withdrawal_amount = sc.nextInt();

        // Condition 1: Amount should be multiple of 100
        if (withdrawal_amount % 100 != 0) {

            System.out.println("Enter amount in multiples of 100");

        }

        // Condition 2: Withdrawal amount should not exceed balance
        else if (withdrawal_amount > balance) {

            System.out.println("Insufficient Balance");
            System.out.println("Rs " + balance + " left in account");

        }

        // Condition 3: Minimum Rs 1000 should remain
        else if (balance - withdrawal_amount < 1000) {

            System.out.println("Minimum balance of Rs 1000 must be maintained");

        }

        // Successful withdrawal
        else {

            remaining_balance = balance - withdrawal_amount;

            System.out.println("Money Withdrawn Successfull");
            System.out.println("Rs " + remaining_balance + " left in account");

        }

        sc.close();
    }
}