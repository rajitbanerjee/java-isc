/*
 * Base conversion: Decimal to Hexadecimal
 */
package RecursiveFunctions;
public class dectohex{
	static void main(int n){
  		System.out.println(hex(n));
  		System.out.println("\n");
  		hexa(n);
 	}
 	static String hex(int n){
  		if(n==0) return "";
  		if(n%16 > 9)
   			return hex(n/16) + (char)(n%16 + 55);
  		else 
   			return hex(n/16) + (n%16);
 	}
 	static void hexa(int n){
  		if(n==0) return;
  		hexa(n/16);
  		if(n%16 > 9) 
   			System.out.print((char)(n%16+55));
  		else System.out.print(n%16);
 	}
}