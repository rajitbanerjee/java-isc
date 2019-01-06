/*
 * Sum of series: (x^2) + (x^4)/3! + (x^6)/5! + ... + (x^n)/(n-1)!
 */
package RecursiveFunctions;
import java.util.*;
public class Series{
    static int x,n;
    double sum = 0;
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("x and n:");
        x = sc.nextInt();
        n = sc.nextInt();
        Series ob = new Series();
        ob.calculate();
        ob.display();
    }
    double findfact(int m){
        if(m==0) return 1;
        return m*findfact(m-1);
    }
    double findpower(int x, int y){
        if(y==0) return 1;
        return x*findpower(x,y-1);
    }
    void calculate(){
        int i;
        for(i=2;i<=n;i=i+2){
            sum += findpower(x,i)/findfact(i-1);
        }
    }
    void display(){
        System.out.println(sum);
    }   
}