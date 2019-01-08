/*
 * Rotate a matrix to find its water image
 */
import java.util.*;
public class Rotate{
int a[][], m, i, j;
	public Rotate(int mm){
		m = mm;
		a = new int[m][m];
	}
        void input(){
		Scanner sc = new Scanner(System.in);
  		for(i=0;i<m;i++){
   			System.out.print("Row no. " + (i+1) + ": ");
   			for(j=0;j<m;j++)
    				a[i][j] = sc.nextInt();
  		}
	}	

	void rotate(Rotate R){
 		int x = 0, y = 0;
 		for(i=m-1;i>=0;i--){
  			for(j=0;j<m;j++){
   				a[i][j] = R.a[x][y++];
   				if(y == m){
    					x++;
    					y=0;
  			  	}
			}
		}
	}

	void show(){
		for(i=0;i<m;i++){
 			for(j=0;j<m;j++)
  				System.out.print(a[i][j] + "\t");
  			System.out.println("\n");
		}
	} 

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
  		System.out.print("M = ");
  		int m = sc.nextInt();
  		Rotate R = new Rotate(m);
		R.input();

                Rotate ob = new Rotate(m);
  		ob.rotate(R);
		ob.show();
	}
}
