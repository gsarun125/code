package jan.Day5;

/*
22.Given N. print the Latin Matrix (say N = 3). condition: must not use strings(aka
character literals), arrays (both 1D and 2D), inbuilt functions(like rotate).
A B C
B C A
C A B
 */
public class Qus22 {
    public static void main(String[] args) {

        int N = 3;
        char startChar = 'A';

        for (int i = 1; i <= N; i++) {
            char currentChar = startChar;
            for (int j = 1; j <= N; j++) {
                System.out.print(currentChar + " ");
                currentChar = (char) ((currentChar - 'A' + 1) % N + 'A');
            }
            startChar = (char) ((startChar - 'A' + 1) % N + 'A');
            System.out.println();
        }
    }
}


