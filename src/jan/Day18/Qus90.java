package jan.Day18;

import java.util.HashSet;
import java.util.Set;

/*
Given a string, reverse only vowels in it; leaving rest of the string as it is.
Input : abcdef
Output : ebcdaf
 */
public class Qus90 {
    public static void main(String[] args) {
        String input="abcdef";
        String result=reverseVowels(input);
        System.out.println(result);
    }

    private static String reverseVowels(String input) {
        char[] chars=input.toCharArray();

        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left=0;
        int right= chars.length-1;
        while (left<right){
            while (left<right&&!vowels.contains(chars[left]))
            {
                left++;
            }

            while (left<right && !vowels.contains(chars[right])){
                right--;
            }

            if (left<right){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        return  new String(chars);
    }
}
