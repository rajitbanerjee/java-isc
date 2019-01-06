/*
 * Check prime recursively
 */
package RecursiveFunctions;
public class isPrime{
 static int n, i = 2;
 static void main(int n){
  System.out.println(check(n,2));
 }
 static int check(int n, int x){
   if(x<n){
    if(n%x!=0)
     return check(n, ++x);
    return 0;
   }
   return 1; 
 }
}
   
    
  