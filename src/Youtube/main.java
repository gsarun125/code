package Youtube;

public class main {

    public static void main(String[] args) {

      int  result=fun(10,4);
        System.out.println(result);
    }

    private static int fun(int a, int b) {
        if(b==0){
            return -1;
        }
        if(a<b){
            return 0;
        }
        int c=fun(a-b,b)+1;
        return c;
    }

}
