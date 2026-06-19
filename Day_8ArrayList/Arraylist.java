package Day_8ArrayList;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(20);
        arr.add(19);
        arr.add(15);
        arr.add(12);

        System.out.println(arr.get(2));
        arr.set(3, 50);

        System.out.println(arr);

        int n = arr.size();

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }

}
