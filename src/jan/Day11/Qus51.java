package jan.Day11;

import java.util.HashSet;

/*
51.Print all distinct permutations of a given string with duplicate characters.
https://www.geeksforgeeks.org/distinct-permutations-string-set-2

 */
public class Qus51 {
    public static void main(String[] args) {
        String input = "ABCA";
        printDistinctPermutation(input);
    }

    private static void printDistinctPermutation(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        HashSet<String> set = new HashSet<>();
        permute(charArray, 0, length - 1, set);
        System.out.println(set);
    }

    private static void permute(char[] charArray, int left, int right, HashSet<String> set) {
        if (left == right) {
            System.out.println("fdf");
            set.add(new String(charArray));
            return;
        }

        for (int i = left; i <= right; i++) {
            swap(charArray, left, i);
            permute(charArray, left + 1, right, set);
            swap(charArray, left, i);
        }

    }

    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
