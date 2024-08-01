package jan.Day16;

import java.util.ArrayList;
import java.util.List;

/*
76.Print only numbers which is present in Fibonacci series (0 1 1 2 3 5 8 ……..)
Example:



Input: 2 10 4 8
Output: 2 8
Input: 1 10 6 8 13 21
Output: 1 8 13 21

 */
public class Qus76 {
    public static void main(String[] args) {
        int input1[] = {2, 10, 4, 8};
        System.out.println(getFibnacciNumber(input1));
    }

    private static List<Integer> getFibnacciNumber(int[] input1) {

        List<Integer> result = new ArrayList<>();
        for (int num : input1) {
            if (isFibonacci(num)) {
                result.add(num);
            }
        }
        return result;
    }

    private static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int a = 0;
        int b = 1;

        while (b <= num) {
            if (b == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
