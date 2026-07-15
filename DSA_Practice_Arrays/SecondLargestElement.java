package DSA_Practice_Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i]>slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }

}
