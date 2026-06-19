package Day_8ArrayList;


import java.util.Collections;
import java.util.Vector;

public class AddTwoArrays {

    public static Vector<Integer> add(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        Vector<Integer> ans = new Vector<>();
        int i = n1 - 1;
        int j = n2 - 1;

        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            ans.add(sum % 10);
            carry = sum / 10;

        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = { 9, 9, 9 };
        int[] arr2 = { 1, 2, 3, 4 };

        Vector<Integer> result = add(arr1, arr2);

        System.out.println("Sum = " + result);
    }

}
