package Youtube;

import java.util.HashMap;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int a[]={89,24,75,11,23};
        int b[]={89,2,4,89,24};

        int result=NumberOfElement(a,b,a.length,b.length);
        System.out.println(result);

    }

    private static int NumberOfElement(int[] a, int[] b, int n, int m) {

        HashMap<Integer,Integer> data=new HashMap<>();
        int count=0;
        if (n>m){
            for(int i=0;i<m;i++){
                data.put(b[i],1);
            }
            for (int i=0;i<n;i++){
                if (data.containsKey(a[i])) {
                    if (data.get(a[i]) == 1) {
                        count++;
                        data.replace(a[i], 0);
                    }
                }
            }
        }else {
            for(int i=0;i<n;i++){
                data.put(a[i],1);
            }
            for (int i=0;i<m;i++){
                if (data.containsKey(b[i])) {
                    if (data.get(b[i]) == 1) {
                        count++;
                        data.replace(b[i], 0);
                    }
                }
            }
        }


        return count;
    }
}
