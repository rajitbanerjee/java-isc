/*
 * Program to check if input matrix is a magic square
 * Magic square:  a magic square is an arrangement of distinct numbers (i.e., each number is used once), 
 * usually integers, in a square grid, where the numbers in each row, and in each column, and the numbers 
 * in the main and secondary diagonals, all add up to the same number.
 */
import java.util.*;
public class Magic{
	public static void main(String[]args){
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter N: ");
  		int n = sc.nextInt();
  		int a[][] = new int[n][n];
  		int i, j, s = 0, d=0;

  		System.out.println("Enter matrix elements: ");
  		for(i=0;i<n;i++){
   			System.out.print("Row " + (i+1) + ": ");
   			for(j=0;j<n;j++)
    				a[i][j] = sc.nextInt();
  		}

  		for(i=0;i<n;i++){
   			for(j=0;j<n;j++){
    				if(i==0) d += a[i][j];
    				if(i==j) s+= a[i][j];
    				if(i+j==n-1) s+= a[i][j];
    				s+=a[i][j];
    				s+=a[i][j];
   			}
              	}
  		int x = n*2  + 2;
  		if(s/x == d) System.out.println("Magic");
  		else System.out.println("No");
 	}
}
   