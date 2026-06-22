package Day_8ArrayList;

import java.util.ArrayList;

public class ArrayList_AddRemoveGet {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        
        names.add("Akarshika");
        names.add("Rahul");
        names.add("Priya");
        names.add("Aman");

        System.out.println("Original ArrayList:");
        System.out.println(names);

   
        System.out.println("First element: " + names.get(0));

        names.set(1, "Rohan");

        System.out.println("After Update:");
        System.out.println(names);

        names.remove("Priya");

        System.out.println("After Remove:");
        System.out.println(names);

   
        System.out.println("Size: " + names.size());

        System.out.println("All Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
