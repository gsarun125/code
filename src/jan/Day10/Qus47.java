package jan.Day10;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
47. Given an input string and a dictionary of words,
find out if the input string can be segmented into a space-separated sequence of dictionary words.
See following examples for more details.
Consider the following dictionary
{ i, like, sam, sung, samsung, mobile, ice,
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung"
or "i like sam sung".<>

 */
public class Qus47 {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"));
        String input1 = "ilike";
        System.out.println("Can be segmented: " + wordBreak(input1, dictionary));

    }

    private static boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        System.out.println(n);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(s.substring(j, i));
                System.out.println(i + " " + j + " " + dp[j] + " " + wordDict.contains(s.substring(j, i)));
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    System.out.println("hi");
                    dp[i] = true;
                    break;
                }
            }
        }
        for (boolean i : dp) {
            System.out.print(i);
        }
        return dp[n];
    }
}
