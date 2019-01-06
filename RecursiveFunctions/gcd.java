/*
 * HCF(GCD) of 2 numbers
 */
package RecursiveFunctions;
import java.util.*;
public class gcd{
  public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two numbers:");
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("GCD: " + g(a,b));
     }
  static int g(int x, int y){
        if(y==0) return x;
        else return g(y,x%y);
   }
}