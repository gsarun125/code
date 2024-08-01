package jan.Day13;

/*
65.prime factor – sort the array based on the minimum factor they have.
 */
public class Qus65 {
    public static void main(String[] args) {
        int[] array = {5, 11, 10, 20, 9, 16, 23};
        sortByPrimeFactor(array);
        for (int a:array){
        System.out.println(a);}
    }

    private static void sortByPrimeFactor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                int factor1 =getMinPrimeFactor(array[j]);
                int factor2=getMinPrimeFactor(array[j+1]);
               if(factor1>factor2){
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
            }
        }
    }

    private static int getMinPrimeFactor(int num) {
        if (num <= 1) {
            return num;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num+"i"+i);
                return i;
            }
        }
        return num;
    }
}
