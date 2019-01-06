/*
 * Special number: Sum of the factorial of digits of a number = original number
 * 1! + 4! + 5! = 145
 */
package RecursiveFunctions;
public class SpecialRec{
    public static void main(String[]args){
     for(int i=1;i<=1000000;i++)
      if(sod(i)== i)
       System.out.println(i);
    }
    static int fact(int a){
     if(a==0) return 1;
     return a*fact(a-1);
    }
    static int sod(int n){
     if(n==0) return 0;
     return (fact(n%10)) + sod(n/10);
    }
}