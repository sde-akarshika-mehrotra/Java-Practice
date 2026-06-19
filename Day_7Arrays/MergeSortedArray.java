package Day_7Arrays;

public class MergeSortedArray {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int ans[] = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            }

            else {
                ans[k] = arr2[j];
                j++;
            }
            k++;

        }

        while (i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] result = mergeArrays(arr1, arr2);

        System.out.print("Merged Array = ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
