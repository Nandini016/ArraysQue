import java.util.*;

public class Matrix {
    public static boolean search(int matrix[][], int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == k) {
                    System.out.print("Element found at " + i + ", " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//to show the elements of array
        System.out.println("Entered matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Example usage of the search method
        System.out.println("Enter the element to search:");
        int elementToSearch = sc.nextInt();

        if (search(matrix, elementToSearch)) {
            System.out.println(" - Found!");
        } else {
            System.out.println(" - Not Found!");
        }
    }
}
