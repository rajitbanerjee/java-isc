/*
 * Calculate the sum 5 + 55 + 555 + 5555 + ... n terms
 */

import java.util.*;
public class Sum{
 static int x = 0, sum = 0;
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n: ");
  int n = sc.nextInt();
  System.out.println("Sum = " + rec(n));
 }
 static int rec(int n){
  if(n==0) return 0;
  sum += sum*10 + 5;
  rec(n-1);
  return sum;
 }
}
  
