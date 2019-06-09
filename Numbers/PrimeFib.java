/**
 * Program prints all prime Fibonnaci numbers in a range
 */
package Numbers;

import java.util.*;

public class PrimeFib {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter n to print all prime fibonacci numbers til n: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        while (true) {
            c = a + b;
            a = b;
            b = c;
            if (c > n)
                break;
            if (prime(c) == 1)
                System.out.print(c + " ");
        }
    }

    static int prime(int x) {
        int i, c = 0;
        for (i = 1; i <= x; i++)
            if (x % i == 0)
                c++;
        if (c == 2)
            return 1;
        else
            return 0;
    }
}
