package DSA_Practice_Arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        System.out.println(ssmallest);
    }
}
