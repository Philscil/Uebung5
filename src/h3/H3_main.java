package h3;

public class H3_main {
    public static void main (String[] args) {
        int[] row1 = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] row2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int[][] einheiten = {row1, row2};

        int input = 6279;

        if (input != 0) {
            int temp_input = input;

            int index = 14;

            while (temp_input > 0) {
                int lastdigit = temp_input % 10;

                while (lastdigit != 0) {
                    if (lastdigit - 5 >= 0) {
                        lastdigit -= 5;
                        einheiten[1][index-2] += 1;
                    } else if (lastdigit - 2 >= 0) {
                        lastdigit -= 2;
                        einheiten[1][index-1] += 1;
                    } else if (lastdigit - 1 >= 0) {
                        lastdigit -= 1;
                        einheiten[1][index] += 1;
                    }
                        
                }

                temp_input = temp_input / 10;

                index = index -3;
            }
        }

        for (int i = 0; i < einheiten[0].length; i++) {
            System.out.print(einheiten[0][i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < einheiten[1].length; i++) {
            System.out.print(einheiten[1][i] + ", ");
        }
    }
}
