/*
 * Reverse the digits of a number, 1234 becomes 4321
 */

import java.util.*;
public class revdig{
	int revn = 0;
 	void main(){
	    Scanner sc = new Scanner(System.in);
  	    System.out.println("Enter n: ");
            int n = sc.nextInt();
  	    revn = re(n); 
  	    System.out.println("Reverse: " + revn);
            //or System.out.println("Reverse: " + rev(n));
 	}

        //another way: call function rev(int n)
 	String rev(int n){
  	    if(n==0) return "";
            return (n%10) +  rev(n/10);
 	}
       
        int re(int n){
            if(n==0) return 0;
            revn = revn*10 + (n%10);
            re(n/10);
            return revn;
 	}
}