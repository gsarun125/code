package jan.Day16;
/*
.. Print pattern like this
Example:
Input: 1
Output: 0

Input: 2
Output:
0 0
0 1
1 0
1 1

Input: 3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1

 */

import java.util.Scanner;

public class Qus77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int totalCombination = (int) Math.pow(2, n);
        for (int i = 0; i < totalCombination; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int bit = (i >> j) & 1;
                System.out.print(bit + " ");
            }
            System.out.println();
        }
    }
}
