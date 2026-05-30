package Day_3Conditionals_2;

import java.util.Scanner;

public class LoanEligibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.println("Enter your creditScore: ");
        int creditScore = sc.nextInt();

        if (age >= 21 && salary >= 25000 && creditScore >= 700) {
            System.out.println("Loan Approved!");

            if (salary > 100000) {
                System.out.println("Eligible for Premium Loan");
            }
        }  
        else {
            System.out.println("Loan Rejected");

            if (age < 21) {
                System.out.println("- Age must be at least 21");
            }

            if (salary < 25000) {
                System.out.println("- Salary must be at least Rs25000");
            }

            if (creditScore < 700) {
                System.out.println("- Credit Score must be at least 700");
            }
        }

        sc.close();
    }

}
