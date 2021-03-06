/**
 * Calculate LCM of 2 numbers
 */
package RecursiveFunctions;

import java.util.*;

public class LcmRec {
    static Scanner sc = new Scanner(System.in);
    static int x, y;

    LcmRec(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public static void main(String[] args) {
        System.out.println("Enter two no.s:");
        x = sc.nextInt();
        y = sc.nextInt();
        LcmRec ob = new LcmRec(x, y);
        ob.show();
    }

    int lcm(int x, int y, int i) {
        if (i % x == 0 && i % y == 0)
            return i;
        return lcm(x, y, ++i);
    }

    void show() {
        System.out.println(lcm(x, y, 2));
    }
}
