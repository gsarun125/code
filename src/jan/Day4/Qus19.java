package jan.Day4;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all the possible subsets of array which adds up to give a sum.
 * Input: array{2, 3, 5, 8, 10}
 * sum=10
 * Output: {2, 3, 5}
 * {2, 8}
 * {10}
 */
public class Qus19 {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 8,10};
        int sum = 10;
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(arr, sum, 0, new ArrayList<>(), subsets);


        // Print the subsets
        for (List<Integer> subset : subsets) {
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

