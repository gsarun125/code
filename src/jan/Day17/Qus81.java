package jan.Day17;

/*
. Print the total number of odd and even digits in the given number.

  Ex.  Input  :  1234567

    Output  :  ODD 4
        EVEN 3

 */
public class Qus81 {
    public static void main(String[] args) {
        int num=1234567;
        int even = 0;
        int odd = 0;
        while (num>0){
            int digit=num %10;
            if (digit%2==0){
                even+=1;
            }
            else {
                odd+=1;
            }
            num=num/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
