/*
 * Matrix Pattern with size n and 3 characters
 */
import java.util.*;
public class Pattern{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of matrix: ");
  int n = sc.nextInt();
  char a[][] = new char[n][n];
  System.out.println("Enter 3 characters: ");
  char k1 = sc.next().charAt(0);
  char k2 = sc.next().charAt(0);
  char k3 = sc.next().charAt(0);
  int i, j;
  for(i=0;i<n;i++){
   for(j=0;j<n;j++){
    if(i == j||(i+j == n-1)) a[i][j] = k1;
    else if((i<n/2 && j>i && i+j<n-1)||(i>n/2 && i>j && i+j>n-1)) a[i][j] = k2;
    else a[i][j] = k3;
   }
  }
  for(i=0;i<n;i++){
   for(j=0;j<n;j++){
    System.out.print(a[i][j] + "\t");
   }
   System.out.println("\n");
  }
 }
}