package jan.Day3;

/**
 * Sample Input-
 * 2
 * Hacker
 * Rank
 * Sample Output-
 * Hce akr
 * Rn ak
 */
public class Qus11 {
    public static void main(String[] args) {
        String input = "Hacker Rank";
        int key = 2;
        String result = "";
        //converting the String to String Array
        String[] word = input.split("\\s+");
        //geting the String Array data
        for (String wordin : word) {
            String prifix = "";
            String sufix = "";
            //makeing Prefix
            for (int i = 0; i < wordin.length(); ) {
                prifix += String.valueOf(wordin.charAt(i));
                i = i + key;
            }
            //making sufix
            for (int i = 1; i < wordin.length(); ) {

                sufix += String.valueOf(wordin.charAt(i));
                i = i + key;
            }
            //joing the both output
            result += prifix + " " + sufix + " ";
        }
        System.out.println(result);
    }
}
