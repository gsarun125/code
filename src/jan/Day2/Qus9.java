package jan.Day2;

/*
Reverse the words in the given String1 from the first occurrence of String2 in String1
by maintaining white Spaces.
example: String1 = Input: This is a test String only String2 = st
Output: This is a only String test
 */
public class Qus9 {
    public static void main(String[] args) {
        String String1 = "This is a test String only";
        String String2 = "st";
        String result = reverseWordsAfterSubstring(String1, String2);
        System.out.println(result);
    }

    private static String reverseWordsAfterSubstring(String string1, String subString) {
        //find the subString index in string1
        int index = string1.indexOf(subString);
        int prefixend = 0;
        System.out.println(index);
        //using that index going back to find the word
        if (index != -1) {
            for (int i = index; i > 0; i--) {
                if (string1.charAt(i) == '\s') {
                    prefixend = i;
                    break;
                }
            }
            //starting to prefixend
            String prefix = string1.substring(0, prefixend);

            //prefixed+1,string end
            String suffix = string1.substring(prefixend + 1, string1.length());
            // reverse the word
            String reversedSuffix = reverseWords(suffix);
            return prefix + reversedSuffix;
        } else {
            return string1;
        }
    }

    private static String reverseWords(String suffix) {
        //split the String to String array using space
        String[] words = suffix.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        //iterate and append in StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(" ").append(words[i]);
        }

        return reversed.toString();
    }

}
