package jan.Day17;
/*
83. Print the following pattern
  Ex.  INPUT  :  5

    OUTPUT  :

            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1

  Ex.  INPUT  :  7

    OUTPUT  :

            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
       1 5 10 10 5 1
      1 6 15 20 15 6 1

 */
public class Qus83 {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++){
            for (int j=1;j<=num-i-1;j++){
                System.out.print(" ");
            }
            int val=1;
            for (int j=0;j<=i;j++){
                System.out.print(val+" ");
                val =val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
