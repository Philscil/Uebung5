package h2;

public class H2_main {

    public static void main(String[] args) {
        int n = 48889;
        int digits = 0;
        int[] a = new int[9];

        if (n == 0) {
            digits = 1;
            a[8] = 0;
        } else {
            int tempN = n;
            int k = 8;

            while (tempN > 0) {
                int lastDigit = tempN % 10;

                if (k >= 0) {
                    a[k] = lastDigit;
                }
                digits++;

                tempN = tempN / 10;
                k--;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        System.out.println("Digits: " + digits);
    }
}
