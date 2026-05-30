package Day_3Conditionals_2;

import java.util.Scanner;

public class ShoppingDiscountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        double purchaseAmount = sc.nextDouble();

        System.out.println("Are you a primeMember: ");
        String primeMember = sc.next();

        double totalAmount = purchaseAmount;
        double discount = 0;

        if (primeMember.equalsIgnoreCase("yes")) {
            double primeDiscount = totalAmount * 0.05;
            totalAmount = totalAmount - primeDiscount;
        }

        if (purchaseAmount > 5000) {
            discount = totalAmount * 0.20;
        } else if (purchaseAmount > 2000) {
            discount = totalAmount * 0.10;
        }

        totalAmount = totalAmount - discount;

        System.out.println("Final Bill Amount: Rs " + totalAmount);

        sc.close();
    }

}
