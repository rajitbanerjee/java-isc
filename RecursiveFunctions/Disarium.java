/*
 * Disarium number: Sum of its digits powered with their respective positions is equal to the original number
 * 1^1 + 3^2 + 5^3 = 135
 */

public class Disarium{
 static int size = 0, n = 0;
 static void count(){
  String a = "" + n;
  size = a.length();
 }
 static void main(int x){
  n = x;
  count();
  if(dis(n, size)==n) System.out.println("Disarium");
  else System.out.print("NO");
 }
 static int dis(int n, int c){
  if(n==0) return 0;
  return (int)(Math.pow(n%10, c)) + dis(n/10, c-1);
 }
}
  