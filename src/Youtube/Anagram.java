package Youtube;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

        boolean ans=isAnagram("cat","act");
        System.out.println(ans);
    }

    private static boolean isAnagram(String s1, String s2) {

        HashMap<Character,Integer> data=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            data.put(c, data.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!data.containsKey(c)  || data.get(c)>0) {
                return false;
            }
            data.put(c, data.get(c) - 1);
        }

        return true;
    }
}
