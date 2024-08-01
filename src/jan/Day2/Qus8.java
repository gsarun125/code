package jan.Day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Q2. Print all possible subsets of the given array whose sum equals to given N.
 * example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}
 */
public class Qus8 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int sum = 6;
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(arr, sum, 0, new ArrayList<>(), subsets);
        // Print the subsets
        for (List<Integer> subset : subsets) {
            System.out.println("jhdfhjadfhj");
            System.out.println(subset);
        }
    }

    private static void findSubsets(int[] arr, int sum, int i, List<Integer> currentSubset, List<List<Integer>> subsets) {

        if (sum == 0) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        if (sum < 0 || i == arr.length) {
            return;
        }

        //picked
        // Include the current element in the currentSubset
        currentSubset.add(arr[i]);

        findSubsets(arr, sum - arr[i], i + 1, currentSubset, subsets);

        //not picked
        // Exclude the current element from the currentSubset (backtrack)
        currentSubset.remove(currentSubset.size() - 1);
        // Move to the next element
        findSubsets(arr, sum, i + 1, currentSubset, subsets);
   }
}
