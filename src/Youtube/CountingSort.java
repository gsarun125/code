package Youtube;

public class CountingSort {
    public static void main(String[] args) {
        String arr = "edsab";
        int count[] = new int[26];
        for (int i = 0; i < arr.length(); i++) {
            int temp = (int) arr.charAt(i) - 97;
            count[temp]++;
        }
        String ans = new String();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans += (char) (i + 97);
            }
        }
        System.out.println(ans);
    }
}
