import java.util.*;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1; // Corrected the end column index

        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            startrow++;

            // right
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            endcol--;

            // bottom
            if (startrow <= endrow) { // Check if there's a row to print
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
                endrow--;
            }

            // left
            if (startcol <= endcol) { // Check if there's a column to print
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
                startcol++;
            }
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        printSpiral(matrix);
    }
}
