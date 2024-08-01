package jan.Day9;

import java.util.ArrayList;
import java.util.List;

/*
44.Given an array A[] and a number x, check for pair in A[] with sum as x.
Eg : Input {1, 2, 4, 3, 5, 6}
SUM : 5
Output : 2  (1, 4) & (2, 3)

 */
public class Qus44 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 5, 6};
        int sum = 5;
        List<List<Integer>> ans = new ArrayList<>();
        findPair(0, arr, sum, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void findPair(int index, int[] arr, int sum, ArrayList<Integer> subset, List<List<Integer>> ans) {
        if (sum == 0 && subset.size() == 2) {

            ans.add(new ArrayList<>(subset));
            return;
        }
        if (sum < 0 || index == arr.length) {
            return;
        }
        subset.add(arr[index]);
        findPair(index + 1, arr, sum - arr[index], subset, ans);

        subset.remove(subset.size() - 1);
        findPair(index + 1, arr, sum, subset, ans);
    }
}
