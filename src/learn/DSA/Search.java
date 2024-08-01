package learn.DSA;

public class Search {
    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 9, 11, 13};
        int target = 11;
        int result = BinarySeach(nums, target);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("element not found");
        }
    }


    private static int linearSeach(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    private static int BinarySeach(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(nums[mid]==target){
               return mid;
           }else if (nums[mid]<target){
               left=mid+1;
           }else {
               right=mid;
           }
       }

        return -1;
    }
}
