package Day_7Arrays;

public class Indexing {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i] *= 2;
            } else {
                arr[i] += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
