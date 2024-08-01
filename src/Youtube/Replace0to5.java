package Youtube;

public class Replace0to5 {
    public static void main(String[] args) {
        int ans = 0;
        int n=1004;
       if (n==0){
           ans=5;
       }
       int factor=1;
       while (n>0){
           if (n%10==0){
               ans+=5*factor;
           }else {
               ans+=(n%10*factor);
           }
           n=n/10;
           factor=factor*10;
       }
        System.out.println(ans);
    }
}
