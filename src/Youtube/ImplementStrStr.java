package Youtube;
//https://youtu.be/s-F-GtDneow?si=c4ygkayjpHEc8EjB
//https://www.geeksforgeeks.org/problems/implement-strstr/1
public class ImplementStrStr {
    public static void main(String[] args) {
        String mainstring ="Arungs";
        String subString="gs";
        System.out.println(strstr(mainstring,subString));
    }

    public static int strstr(String mainString, String subString) {

        int index = -1;
        int l;
        int flag = 0;
        for (int i = 0; i<mainString.length() ; i++) {
            l = i;
            if (mainString.charAt(i) == subString.charAt(0)) ;
            {
                for (int j = 0;j< subString.length(); j++) {
                    if (mainString.charAt(l) == subString.charAt(j)) {
                        l++;
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    index = i;
                    return index;
                }
            }
        }
        return index;
    }
}
