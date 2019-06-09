/**
 * Print x Fibonacci numbers
 */
package RecursiveFunctions;

import java.util.*;
public class Fibo {
    static int a = 0, b = 1, c = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of terms: ");
        int x = sc.nextInt();
        System.out.print(a + " " + b);
        Fibo ob = new Fibo();
        ob.fib(x - 2);
    }

    void fib(int n) {
        if (n == 0)
            return;
        fib(n - 1);
        c = a + b;
        a = b;
        b = c;
        System.out.print(" " + c);
    }
}
