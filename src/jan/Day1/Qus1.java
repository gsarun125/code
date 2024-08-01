package jan.Day1;

/*
Given an array of integers, replace every element with the next greatest element
(greatest element on the right side) in the array. Since there is no element next to the
last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it
should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class Qus1 {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 5, 2};
        int n = arr.length;
        int ans[] = rearange(arr, n);
        for (int a : ans) {
            System.out.println(a);
        }
    }

    private static int[] rearange(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int max = -1;
            //find max after index i and store it in array ith position

            for (int j = i + 1; j < n; j++) {

                System.out.println(max+" "+arr[j]);
                max = Math.max(max, arr[j]);
            }
            arr[i] = max;
        }
        return arr;
    }
}
