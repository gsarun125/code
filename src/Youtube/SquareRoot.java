package Youtube;

public class SquareRoot {
    public static void main(String[] args) {

        int result=sqrtby(4);
        System.out.println(result);
    }

    private static int sqrtby(int i) {
        int beg=1;
        int end=i;
        int mid;
        int ans=0;
        while (beg<=end){
            mid=(beg+end)/2;
            if(mid*mid ==i){
                return mid;
            } else if (mid*mid<=i) {
                beg=mid+1;
                ans=mid;
            }else {
                end=mid -1;
            }
        }
        return ans;
    }
}
