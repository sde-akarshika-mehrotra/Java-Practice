package Day_7Arrays;

public class SumAndProduct {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.print("Product = " + product);
    }

}
