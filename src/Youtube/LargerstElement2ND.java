package Youtube;

public class LargerstElement2ND {
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 6, 5};
        int max = -1;
        int secondMax = -1;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax) {
                secondMax = i;
            }
        }
        System.out.println(secondMax);
    }
}
