package p3;

public class P3_main {
    public static void main (String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};

        int[][] matrix = {a, b, c};

        // a)

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                matrix[i][j] += 1;
                System.out.print(matrix[i][j] + " ");
            };
            System.out.println();
        };

        // b)

        int sum = 0;

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            };
        };

        System.out.println("Summe der Elemente: " + sum);

        int[] temp_a = {matrix[2][0],matrix[1][0],matrix[0][0]};
        int[] temp_b = {matrix[2][1],matrix[1][1],matrix[0][1]};
        int[] temp_c = {matrix[2][2],matrix[1][2],matrix[0][2]};

        int[][] temp_matrix = {temp_a, temp_b, temp_c};

        for (int i=0; i < temp_matrix.length; i++) {
            for (int j=0; j < temp_matrix[i].length; j++) {
                System.out.print(temp_matrix[i][j] + " ");
            };
            System.out.println();
        };

    }
}
