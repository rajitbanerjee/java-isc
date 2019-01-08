/*
 * Rotate matrix by 90 degrees and find sum of boundary/corner elements
 */
import java.util.*;
public class Rotation{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter m: ");
  int m = sc.nextInt();
  int a[][] = new int[m][m];
  int b[] = new int[m*m];
  int i,j, x=0, y=0, sum = 0;
  for(i=0;i<m;i++){
   System.out.print("Row no. " + (i+1) + " : ");
   for(j=0;j<m;j++){
    a[i][j] = sc.nextInt();
    b[x++] = a[i][j];
   }
  }
  System.out.println("Original matrix: ");
  for(i=0;i<m;i++){
   for(j=0;j<m;j++)
    System.out.print(a[i][j] + "\t");
    System.out.println();
  }
  for(i=m-1;i>=0;i--){
   for(j=0;j<m;j++){
    a[j][i] = b[y++];
   }
  }
  System.out.println("After rotation: ");
  for(i=0;i<m;i++){
   for(j=0;j<m;j++)
    System.out.print(a[i][j] + "\t");
    System.out.println();
  }
  for(i=0;i<m;i++){
   for(j=0;j<m;j++){
    if(i==0||j==0||i==m-1||j==m-1)
     sum += a[i][j];
   }
  }
  System.out.println("Sum of corner elements: " + sum);
 }
}
    