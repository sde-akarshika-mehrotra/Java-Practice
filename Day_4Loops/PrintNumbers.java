package Day_4Loops;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for ( int i=0; i<=n; i++) {
            System.out.println(i);

        }
        sc.close();
    }
    
}
