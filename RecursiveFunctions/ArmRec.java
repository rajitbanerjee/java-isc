/*
 * Check Armstrong number e.g. 1^3 + 3^3 + 5^3 = 135
 */
package RecursiveFunctions;
import java.util.*;
public class ArmRec{
    static int sum = 0;
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number:");
     int n = sc.nextInt();
     if(arm(n) == n) System.out.println("Armstrong.");
     else System.out.println("No.");
    }
    static int arm(int x){
       if(x==0) return 0;
       sum += (int)Math.pow(x%10,3);
       arm(x/10);
       return sum;
    }
}
       