import java.util.ArrayList;
import java.util.List;

/*
24. Finding all permutations of a string. (backtracking approach).
*/
public class Test {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        Test obj = new Test();
        obj.recurPermute(0, nums, ans);
        System.out.println(ans);
    }

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    private void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
