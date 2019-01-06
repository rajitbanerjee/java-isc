/*
 * nth Fibonacci number
 */
package RecursiveFunctions;
import java.util.*;
public class fibo2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        fibo2 f = new fibo2();
        System.out.print(f.fib(n) + " ");//nth fibonacci number eg. n=6; output=8
    }
    public int fib(int n){
        if(n<=1) return n;
        else return fib (n-1) + fib(n-2);
    }
}
