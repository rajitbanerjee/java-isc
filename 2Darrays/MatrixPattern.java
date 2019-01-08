/* 
 * Matrix Pattern: input n and store numbers 1,2,3,...,n x n first in the lower triangular part, 
 * then in the upper traingle of the matrix.
 */
import java.util.*;
public class MatrixPattern{
    public static void main(String[]args){
        System.out.print("\u000c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: "); int n = sc.nextInt();
        int i, j, k = 1, f = n*n, c = 1;
        int a[][] = new int[n][n];
        for(i=0; i<n; i++){
            for(j= 0; j<=i; j++){
                a[i][j] = k++;
            }
        } 
        for(i=0; i<n-1 ; i++){
            for(j=c++; j<n; j++){
                a[i][j] = f--;
            }
        }
        System.out.println("\n");
        for(i=0; i<n; i++){
            for(j= 0; j< n; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
        