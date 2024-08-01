package jan.Day10;

/*
46.Diamond pattern : for given input size -> Here 3
  *
 ***
*****
 ***
  *
 */
public class Qus46 {

    public static void main(String[] args) {
        int size = 4;
        printDiamondPattern(size);
    }

    private static void printDiamondPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=size-1;i>=1;i--){
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
