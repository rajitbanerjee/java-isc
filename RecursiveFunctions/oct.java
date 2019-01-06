/*
 * Base conversion: decimal to octal
 */

public class oct{
 static int oct = 0, n = 20;
 static void octa(){
  if(n>0){
   n = n/8;
   octa();
   oct = oct*10 + (n%8);
  }
  System.out.println(oct);
 }
}