package Day_4Loops;

import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNo = 7;
        int guess;

        while (true) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (secretNo == guess) {
                System.out.print("Congratulations! You have guessed the correct number.");
                break;
            }

            else if (guess < secretNo) {
                System.out.println("Too low! Try again.");
            }

            else {
                System.out.println("Too high! Try again.");
            }
        }
        
        sc.close();
    }

}
