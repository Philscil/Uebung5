package p1;

public class P1_main {
    public static void main (String[] args) {
        int x = 0;

        while (x <= 10) {
            x = x + 1;
            System.out.println(x);
        }

        // a)

        System.out.println("a)");

        for (int i = 1; i < 12; i++) {
            System.out.println(i);
        }

        // b)

        System.out.println("b)");

        x = 0;

        do {
            x = x + 1;
            System.out.println(x);
        } while (x <= 10);
    }
}
