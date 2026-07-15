package DSA_Practice_Arrays;

public class LargestNum {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

}
