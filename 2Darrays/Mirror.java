/*
 * Display mirror ad water images of a given matrix
 */
import java.util.*;
public class Mirror{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size m x n: ");
  int m = sc.nextInt(); System.out.print(" x "); int n = sc.nextInt();
  int a[][] = new int[m][n];
  int a1[][] = new int [m][n];
  int a2[][] = new int [m][m];
  int b[] = new int[m*n];
  int i, j, x = 0, y = 0, z = 0;
  for(i=0;i<m;i++){
   System.out.print("Row no. " + (i+1) + " : ");
   for(j=0;j<n;j++){
    a[i][j] = sc.nextInt();
    b[x++] = a[i][j];
   }
  }
  for(i=0;i<m;i++){
   for(j=n-1;j>=0;j--){
    a1[i][j] = b[y++];
   }
  }
  for(i=m-1;i>=0;i--){
   for(j=0;j<n;j++){
     a2[i][j] = b[z++];
    }
  }
  System.out.println("Original: ");
  for(i=0;i<m;i++){
   for(j=0;j<n;j++)
   System.out.print(a[i][j] + "\t");
   System.out.println("\n");
  }
  System.out.println("Mirror: ");
  for(i=0;i<m;i++){
   for(j=0;j<n;j++)
   System.out.print(a1[i][j] + "\t");
   System.out.println("\n");
  }
  System.out.println("Water: ");
  for(i=0;i<m;i++){
   for(j=0;j<n;j++)
   System.out.print(a2[i][j] + "\t");
   System.out.println("\n");
  }
}
}
   
   
  