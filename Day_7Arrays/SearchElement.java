package Day_7Arrays;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
