package Day_3Conditionals_2;

import java.util.Scanner;

public class CabFareCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Is it a night ride? (yes/no): ");
        String nightRide = sc.next();

        double fare;

        if (distance <= 5) {
            fare = distance * 10;
        }
        else if (distance <= 15) {
            fare = (5 * 10) + ((distance - 5) * 8);
        }
        else {
            fare = (5 * 10) + (10 * 8) + ((distance - 15) * 5);
        }

        
        if (nightRide.equalsIgnoreCase("yes")) {
            fare = fare + (fare * 20 / 100);
        }

        System.out.println("Total Fare: Rs" + fare);

        sc.close();
    }
}
