/**
 * Disarium number: Sum of its digits powered with their respective positions 
 * is equal to the original number
 * 1^1 + 3^2 + 5^3 = 135
 */
package RecursiveFunctions;

import java.util.*;

public class Disarium {
    static int size = 0, n = 0;
    static Scanner sc = new Scanner(System.in);

    static void count() {
        String a = "" + n;
        size = a.length();
    }

    static int dis(int n, int c) {
        if (n == 0)
            return 0;
        return (int) (Math.pow(n % 10, c)) + dis(n / 10, c - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        count();
        if (dis(n, size) == n)
            System.out.println("Disarium");
        else
            System.out.print("NO");
    }
}
