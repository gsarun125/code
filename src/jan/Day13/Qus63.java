package jan.Day13;
/*
63.array of numbers were given to find a number which has same sum of numbers in it’s either side.
I/p 1, 2, 3, 7, 6

 */
public class Qus63 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 6};
        int output = ans(arr);
        System.out.println(output);
    }

    private static int ans(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate sum on the left of the current element
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Calculate sum on the right of the current element
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }

            // Check if the sums are equal
            if (leftSum == rightSum) {
                return arr[i];
            }
        }

        return -1; // No such number found
    }
}
