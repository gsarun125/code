package jan.Day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
24. Finding all permutations of a string and array. ( backtracking approach ).
 */
public class Qus24 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        String str = "123";
        List<List<Integer>> ansArray = new ArrayList<>();
        Qus24 obj = new Qus24();
        obj.recurPermuteArray(0, nums, ansArray);
        System.out.println(ansArray);

        List<String> ansString = new ArrayList<>();

        obj.recurPermuteString(0, str, ansString);
        System.out.println(ansString);
    }

    private void recurPermuteString(int index, String str, List<String> ans) {

        if (index == str.length()) {
            String ansString = "";
            for (int i = 0; i < str.length(); i++) {
                ansString += str.charAt(i);
            }

            ans.add(ansString);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            str = swapString(i, index, str);
            recurPermuteString(i + 1, str, ans);
            str = swapString(i, index, str);
        }


    }

    private String swapString(int i, int index, String str) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[index];
        charArray[index] = temp;
        return new String(charArray);
    }

    private void recurPermuteArray(int index, int[] nums, List<List<Integer>> ans) {

        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        //recursive call
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermuteArray(index + 1, nums, ans);
            swap(i, index, nums);
        }

    }

    private void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
