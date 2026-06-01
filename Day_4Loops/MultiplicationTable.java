package Day_4Loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " X " + i + " = " + N * i);
        }

        sc.close();

    }

}
