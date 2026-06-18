package Day_7Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        int i = 0, j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
