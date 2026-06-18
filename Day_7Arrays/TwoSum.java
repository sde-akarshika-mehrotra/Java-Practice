package Day_7Arrays;

public class TwoSum {

    public static void twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        twoSum(arr, target);
    }

}
