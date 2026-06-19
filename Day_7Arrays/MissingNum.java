package Day_7Arrays;

public class MissingNum {

    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int elem : arr) {
            arraySum += elem;
        }
        return sum - arraySum;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 5};

        System.out.println("Missing Number = " + missingNum(arr));

    }
}
