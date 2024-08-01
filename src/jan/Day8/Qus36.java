package jan.Day8;

import java.util.HashSet;

/*
* Problem 36:
Many students will able to solve 3 problems in this round. So make sure you stand apart from the crowd.Their vacancy is going to be 5 for a team. The performance in this round could be taken as a tie breaker for round 3.
input : aaabbcc
output : abc

 */
public class Qus36 {
    public static void main(String[] args) {
        String str = "aaabbcc";
        String ans = "";
        char firstvalue = str.charAt(0);
        ans += firstvalue;
        for (int i = 0; i < str.length() - 1; i++) {
            if (firstvalue != str.charAt(i + 1)) {
                firstvalue=str.charAt(i+1);
                ans+=str.charAt(i+1);
            }
        }
        System.out.println(ans);
    }
}
