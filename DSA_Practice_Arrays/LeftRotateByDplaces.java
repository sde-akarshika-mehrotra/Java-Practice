package DSA_Practice_Arrays;

public class LeftRotateByDplaces {

    static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d  = 3;
        int n = arr.length;

        d = d%n;

        Reverse(arr,0 , d-1);

        Reverse(arr, d, n-1);

        Reverse(arr, 0, n-1);


        for (int num : arr) {
            System.out.print(num + " ");
        }
}

}
