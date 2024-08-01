package Youtube;

//input:1ab40b3
//output:14
public class AlphaNumbersSum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        String str = "1ab40b3";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int chnum = ch - '0';
                num = num * 10 + chnum;
            } else {
                sum = sum + num;
                num = 0;
            }
        }
        sum=sum+num;
        System.out.println(sum);
    }
}
