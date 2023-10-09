import java.util.*;

public class SmallestnLargestin2d {
    public static int smallest(int nums[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] < smallest) {
                    smallest = nums[i][j];
                }
            }
        }
        return smallest;
    }

    public static int largest(int nums[][]) {
        int largest = Integer.MIN_VALUE; // Initialize with the minimum possible integer value
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] > largest) {
                    largest = nums[i][j];
                }
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int nums[][] = new int[3][2];
        int n = 3, m = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Call the methods and print the results
        System.out.println("Smallest element: " + smallest(nums));
        System.out.println("Largest element: " + largest(nums));
    }
}
