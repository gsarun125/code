package Youtube;

public class MultiplyPoly {
    public static void main(String[] args) {
        int M=4;
        int N=3;
        int arr1[]={1,0,3,2};
        int arr2[]={2,0,4};

        int Mul[]=new int[M+N-1];
        for (int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                Mul[i+j]+=arr1[i] * arr2[j];
            }
        }

        for (int a:Mul){
            System.out.print(a+" ");
        }
    }
}
