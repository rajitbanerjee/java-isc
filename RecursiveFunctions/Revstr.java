/*
 * Program to reverse a string and check whether it is a palindrome
 */
package RecursiveFunctions;
import java.util.*;
public class Revstr{
 String str = "", revst = "";
 void getStr(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string: ");
  str = sc.nextLine();
 }
 void recReverse(int i){
  if(i == str.length())
   return;
  recReverse(i+1);
  revst += str.charAt(i);
 }
 void check(){
  recReverse(0);
  System.out.println(revst);
  if(revst.equals(str)) System.out.println("Palindrome");
  else System.out.println("NO");
 }
 static void main(){
  Revstr ob = new Revstr();
  ob.getStr();
  ob.check();
 }
}
 
  