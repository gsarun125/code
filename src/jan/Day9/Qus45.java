package jan.Day9;

/*
45.Largest Sum Contiguous Subarray
(Kadane’ Algorithm )
 */
public class Qus45 {
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        int n=a.length;
        maxSubArraySum(a,n);
    }

    private static void maxSubArraySum(int[] a, int n) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int start=0;
        int end=0;
        int s=0;
        for (int i=0;i<n;i++) {
            max_ending_here+=a[i];
            if (max_so_far < max_ending_here) {
                System.out.println(i);
                max_so_far = max_ending_here;
                start = s;
                end=i;
            }
            if (max_ending_here<0){
                System.out.println(i+"fdjhfdhfhj");
                max_ending_here=0;
                s=i+1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
}
