package jan.Day7;

import java.util.Arrays;

/*
33. First Occurrences
Given two strings, find the first occurrence of all characters of second string in the first string and
print the characters between the least and the highest index
I/P: ZOHOCORPORATION PORT
O/P: OHOCORPORAT
Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
So print the characters of the first string in this inex range i.e. OHOCORPORAT

 */
public class Qus33 {
    public static void main(String[] args) {

        String srt1 = "ZOHOCORPORATION";
        String str2 = "PORT";
        occurrence(srt1, str2);
    }

    private static void occurrence(String srt1, String str2) {
        char[] input=srt1.toCharArray();
        int [] temp=new int[str2.length()];
        for(int i=0;i<str2.length();i++){
            for (int j=0;j<input.length;j++){
                if(str2.charAt(i)==input[j]){
                    temp[i]=j;
                    break;
                }
            }
        }
        Arrays.sort(temp);
        System.out.println(temp[temp.length-1]);
        System.out.println(temp[0]);
        System.out.println(srt1.substring(temp[0],temp[temp.length-1]+1));


    }

}
