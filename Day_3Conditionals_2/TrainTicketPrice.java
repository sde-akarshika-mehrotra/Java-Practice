package Day_3Conditionals_2;

import java.util.Scanner;

public class TrainTicketPrice {

    public static void main(String[] args) {

        int basePrice = 1000;
        int finalPrice = basePrice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your ticket class (Sleeper/AC): ");
        String type = sc.next();

        if (type.equalsIgnoreCase("AC")) {
            finalPrice += 500;
        }

        if (age < 12) {
            finalPrice = (finalPrice * 50) / 100;
        } else if (age > 60) {
            finalPrice = (finalPrice * 30) / 100;
        }
        System.out.println("Final Ticket Price: Rs " + finalPrice);

        sc.close();
    }

}
