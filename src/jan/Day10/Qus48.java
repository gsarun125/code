package jan.Day10;

/*
48.Print the following pattern
   1
  3 2
 6 5 4
10 9 8 7
10 9 8 7
 6 5 4
  3 2
   1
 */
public class Qus48 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i * (i - 1) / 2 + 1; // Calculate the starting number
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Adjust spacing for better formatting
            }
            for (int k = 0; k < i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            int num = i * (i - 1) / 2 + 1; // Calculate the starting number
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Adjust spacing for better formatting
            }
            for (int k = 0; k < i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
