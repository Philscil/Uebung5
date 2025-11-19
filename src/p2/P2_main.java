package p2;

public class P2_main {
    public static void main (String[] args) {
        int[] numbers = {1, -8000, 5};
        int max = numbers[0];
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("MinIndex: " + minIndex);
    }
}
