package jan.Day16;

import java.util.ArrayList;

/*
Example:
Input:
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2

Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
 */
public class Qus79 {

    public static void main(String[] args) {
        int k = 2;
        int arr[] = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            result.add(current);

            if (current == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count == k) {
                result.add(0);
            }
        }
        // Print the result after processing all elements
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
