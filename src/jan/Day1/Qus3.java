package jan.Day1;

/*
3. Equilibrium index of an array is an index such that the sum of elements at lower
indexes is equal to the sum of elements at higher indexes. For example, in an array A:
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1
 */
public class Qus3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        System.out.println(equilibrium(arr, n));
    }

    private static int equilibrium(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }

            int rightsum = 0;
            for (int k = i + 1; k < arr.length; k++) {
                rightsum += arr[k];
            }
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}
