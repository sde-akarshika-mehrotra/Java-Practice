package Day_6Functions;

import java.util.Scanner;

public class FirstBuiltInFunc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no.: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd no.: ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd no.: ");
        int n3 = sc.nextInt();

        int max = Math.max(n1, Math.max(n2, n3));

        System.out.println("Maximum of three numbers is " + max);

        sc.close();

    }

}
