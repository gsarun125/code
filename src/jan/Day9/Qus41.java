package jan.Day9;

/*
41.Given a String with or without special characters find if it is Palindrome or Not.. No splitting of array must be done or No additional spaces must be used for storing the array..
Eg: RACE CAR
Eg: I DID, DID I ?

 */
public class Qus41 {
    public static void main(String[] args) {
        String str = "I DID";
        boolean result = isPalindrome(str);
        if(result==true){
            System.out.println("isValid");
        }else {
            System.out.println("inValid");
        }
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
