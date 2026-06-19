package Day_7Arrays;

public class SegregateZeroOne {

    public static void segregateZeroOne(int[] arr) {
        int numOfZero = 0;

        for (int elem : arr) {
            if (elem == 0) {
                numOfZero++;
            }
        }

        for (int i = 0; i < numOfZero; i++) {
            arr[i] = 0;
        }

        for (int i = numOfZero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 0, 1, 0, 1 };

        segregateZeroOne(arr);

        System.out.print("Segregated Array = ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
