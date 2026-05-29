package Day_2Conditionals;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (sub1 < 33 || sub2 < 33 || sub3 < 33 || sub4 < 33 || sub5 < 33) {
            System.out.print("Result: FAIL");
        }

        else if (percentage >= 90) {
            System.out.print("Grade A+");
        } else if (percentage >= 75) {

            System.out.println("Grade: A");

        } else if (percentage >= 60) {

            System.out.println("Grade: B");

        } else if (percentage >= 45) {

            System.out.println("Grade: C");
        }

        if (percentage > 85) {
            System.out.println("Distinction Achieved!");
        }

        sc.close();
    }
}
