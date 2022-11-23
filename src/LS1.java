public class LS1 {
    static int minOperations(int a, int b, int c, int d)
    {
        String k1 = "k1";
        String k2 = "k2";

        if (a == b)
            return 0;

        if (a <= 0 && b > 0)
            return -1;

        if (a > b) {
            return 0;
        }

        if (b % 2 != 0) {
            System.out.println(k2 + "a + d");
            return 1 + minOperations(a + d, b, c, d); // return 1 + minOperations(a, b - d, c, d);
        }
        else
            System.out.println(k1 + "a * c");
        return 1 + minOperations(a * c, b, c, d); // return 1 + minOperations(a, b / c, c, d);
    }

    public static void main(String[] args)
    {
        System.out.println(minOperations(1, 7, 2, 1));
    }
}

