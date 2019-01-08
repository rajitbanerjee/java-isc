/*
 * Fill a matrix with composite numbers
 */
import java.util.*;
public class Composite{
 int m, n ,arr[][];
 Composite(int mm, int nn){
  m = mm; n = nn;
  arr = new int[m][n];
 }
 int isComposite(int p){
  int c = 0;
  for(int i = 1;i<=p;i++)
   if(p%i==0) c++;
  if(c==2) return 0;
  return 1;
 }
 void fill(){
  int i=0, j = 0, k = 4, f = 0;
  while(f < m*n){
   if(i==m){
    i=0;
    j++;
   }
   if(isComposite(k)==1){
    arr[i++][j] = k;
    f++;
   }
   k++;
  }
 }
 void display(){
  for(int i=0;i<m;i++){
   for(int j=0;j<n;j++)
    System.out.print(arr[i][j] + "\t");
   System.out.println();
  }
 }
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter m(rows) and n(columns):");
  int m = sc.nextInt();
  int n = sc.nextInt();      
  Composite ob = new Composite(m,n);
  ob.fill();
  ob.display();
 }
}
    