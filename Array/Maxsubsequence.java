package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maxsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        // Input elements using loop
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        int maxSubsequence = 0;
        boolean hasPositive = false;

        for (int i = 0; i < arr.size(); i++) {

            int num = arr.get(i);
            // Max Subsequence
            if (num > 0) {
                maxSubsequence += num;
                hasPositive = true;
            }
            // Kadane's Algorithm for Max Subarray
            if (i > 0) {
                current = Math.max(num, current + num);
                maxSubarray = Math.max(maxSubarray, current);
            }
        }
        // If all elements are negative
        if (!hasPositive) {
            maxSubsequence = maxSubarray;
        }
        // Print Results
        System.out.println("Maximum Subarray Sum: " + maxSubarray);
        System.out.println("Maximum Subsequence Sum: " + maxSubsequence);
        sc.close();
    }
}