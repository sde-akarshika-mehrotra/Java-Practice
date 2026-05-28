import java.util.Scanner;
public class EvenOdd {
    
    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
        System.out.print("The number is even");
        } else {
        System.out.print("The number is odd");
        }
        sc.close();
    }
}