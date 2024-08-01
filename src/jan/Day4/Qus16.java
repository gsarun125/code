package jan.Day4;

import java.util.HashMap;

/**
 * 16.Assume there exists infinite grid, you’re given initial position x, y. Inputs will be
 * movements either L or R or U or D. After n inputs, you need to give the current
 * position.
 *  Input:
 *  4 5 //initial position x, y
 *  9 //number of movements
 *  U L R R D D U L R //7 movements
 *  Output:
 * 5 5
 */
public class Qus16 {
    static int x = 4, y = 5;

    public static void main(String[] args) {
        String moves = "ULRRDDULR";
        finalPosition(moves);
        System.out.println(x + " " + y);
    }

    private static void finalPosition(String moves) {
        int l = moves.length();
        for (int i = 0; i < l; i++) {
            if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            } else if (moves.charAt(i) == 'L') {
                x--;
            } else if (moves.charAt(i) == 'R') {
                x++;
            }
        }

    }
}
