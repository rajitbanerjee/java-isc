/*
 * Find the saddle point in a matrix: min element in row, max element in column 
 */
import java.util.*;
public class Saddle{
 public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of matrix (m x n) : ");
  int m = sc.nextInt();
  int n = sc.nextInt();
  int a[][] = new int[m][n];
  int i, j, k, min, max, x=0, f = 0;
  System.out.println("Enter matrix elements: ");
  for(i=0; i<m; i++){
   System.out.print("Row no. " + (i+1) + " : ");
   for(j=0; j<n; j++){
    a[i][j] = sc.nextInt();
   }
  }
  for(i=0;i<m;i++){
   min = a[i][0];
   x = 0;
   for(j=0;j<n;j++){
    if(a[i][j]<min){
     min = a[i][j];
     x = j;
    }
   }
   max = a[0][x];
   for(k=0;k<n;k++){
    if(a[k][x] > max) 
     max = a[k][x];
   }
   if(max == min){
     System.out.println("Saddle point = " + max);
     f = 1;
     break;
   }
  }
  if(f==0) System.out.println("No saddle point");
 }
}
    