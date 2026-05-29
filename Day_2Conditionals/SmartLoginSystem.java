package Day_2Conditionals;
import java.util.Scanner;

public class SmartLoginSystem {

    public static void main(String[] args) {

        int attempts = 0;
        String correct_username = "admin";
        int correct_password = 1234;

        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            int password = sc.nextInt();
            sc.nextLine();

            if (username.equals(correct_username)  && password == correct_password) {
                System.out.println("Login Successful!");
                break;
            }

            else if (username.equals(correct_username) && password != correct_password) {
                System.out.println("Invalid password");
            }

            else if (!username.equals(correct_username) && password == correct_password) {
                System.out.println("Invalid username");
            
            } else {
                System.out.println("Invalid Credentials");
            }

            attempts++;
        }

        if (attempts == 3) {
            System.out.print("Account blocked");
        }

        sc.close();
    }

}
