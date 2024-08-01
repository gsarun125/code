package jan.Day13;

import java.util.ArrayList;
import java.util.Arrays;

/*
62. It’s about anagram.i/p was array of strings .and a word was given to find whether it has anagram in given array.
I/p catch, got, tiger, mat, eat, Pat, tap, tea

Word: ate
O/p eat, tea

 */
public class Qus62 {
    public static final String arr[] = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};

    public static void main(String[] args) {
        String word = "ate";
        char[] chars = word.toCharArray();
        ArrayList<String> ans = new ArrayList<>();
        PrintAnagreams(chars, 0, chars.length - 1, ans);

        System.out.println(ans);

    }

    private static void PrintAnagreams(char[] chars, int start, int end, ArrayList<String> ans) {
        if (start == end) {
            if (Arrays.asList(arr).contains(new String(chars))) {
                ans.add(new String(chars));
            }
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(chars, start, i);
            PrintAnagreams(chars, start + 1, end, ans);
            swap(chars, start, i);
        }

    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
