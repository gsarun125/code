package Youtube;

import java.sql.Array;

public class RemoveCharscter {
    public static void main(String[] args) {
        String MainStr="computer";
        String subStr="cat";
        int arr[]=new int[26];

        for (int i=0;i<subStr.length();i++){
            int index=(int)subStr.charAt(i) -97;
            arr[index]+=1;
        }
        for (int i=0;i<MainStr.length();i++){

        }

    }
}
