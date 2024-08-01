package Youtube;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        methord1(arr);
        System.out.println(methord1(arr));

    }

    private static ArrayList<Integer> methord1(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        ans.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                ans.add(maxFromRight);
            }
        }
        return ans;
    }
}
