/**
 * Computes nth Fibonacci number
 */
package RecursiveFunctions;

import java.util.*;

public class Fibo2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n:");
        int n = sc.nextInt();
        Fibo2 f = new Fibo2();
        System.out.print(f.fib(n) + " ");// nth fibonacci number eg. n=6; output=8
    }

    public int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
