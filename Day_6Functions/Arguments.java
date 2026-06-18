package Day_6Functions;

public class Arguments {

    public static int max(int a, int b, int c) {

        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;

    }

    public static void main(String[] args) {

        System.out.print(max(9, 4, 5));

    }

}
