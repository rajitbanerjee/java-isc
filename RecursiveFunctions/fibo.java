/*
 * Print x Fibonacci numbers
 */

public class fibo{
    int a = 0, b = 1, c = 0;
    void main(int x){
    System.out.print(a + " " + b);
    fibo ob = new fibo();
    ob.fib(x-2);
   }
    void fib(int n){
        if(n==0) return;
        fib(n-1);
        c = a + b;
        a = b;
        b = c;
        System.out.print(" " + c);
    }
}
        