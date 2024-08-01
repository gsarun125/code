package jan.Day4;

/**
 * 17.Given an array of integers, compute the maximum value for each integer in the
 * index, by either summing all the digits or multiplying all the digits. (Choose which
 * operation gives the maximum value)
 *  Input:
 *  5
 *  120 24 71 10 59
 *  Output:
 *  3 8 8 1 45
 */
public class Qus17 {
    public static void main(String[] args) {
        int arr[] = {120, 24, 71, 10, 59};
        int l = arr.length;
        findMaxAddorMull(arr, l);
    }

    private static void findMaxAddorMull(int[] arr, int l) {
        for (int i = 0; i < l; i++) {

            int sum = 0;
            int mul = 1;
            int n = arr[i];
            while (n > 0) {
                int digt = n % 10;
                n = n / 10;
                sum += digt;
                mul *= digt;
            }
            arr[i] = Math.max(sum, mul);
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
