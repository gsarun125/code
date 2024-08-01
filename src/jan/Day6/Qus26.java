package jan.Day6;

import java.util.Arrays;

/*
26.Sort the given elements in decending order based on the number of factors of each
element – Solution 1
 */
public class Qus26 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 28, 18, 20, 30, 4};
        sortElementByFactors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortElementByFactors(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (countFactors(arr[j]) > countFactors(arr[i])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }
}
