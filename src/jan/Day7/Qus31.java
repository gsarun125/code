package jan.Day7;

import java.util.HashSet;

/*
31. 1. Pangram Checking
Check whether all english alphabets are present in the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True
I/P: abc defGhi JklmnOP QRStuv
O/P: False
 */
public class Qus31 {
    public static void main(String[] args) {
        String input="abc defGhi JklmnOP QRStuv wxyz";
        String input1=input.toLowerCase().replaceAll("\\s", "");
        int p=pangram(input1);
        System.out.println(p);
        if(p==26){
            System.out.println("Pangram");
        }else {
            System.out.println("not Pangram");
        }
    }

    private static int pangram(String lowerCase) {
        HashSet<Character> hashSet=new HashSet<>();
        for (int i = 0; i < lowerCase.length(); i++) {
            System.out.println(lowerCase.charAt(i));
            hashSet.add(lowerCase.charAt(i));
        }
        System.out.println(hashSet);
        return hashSet.size();
    }
}
