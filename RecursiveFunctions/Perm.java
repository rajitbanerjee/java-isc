/*
 * Program to print all the permutations of a word
 */
package RecursiveFunctions;
import java.util.*;
public class Perm{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();//input word
        perm("", s);//Calling function perm()
    }
    static void perm(String p, String s){
        int len = s.length();//finding length of word s
        if(len == 0) 
            System.out.println(p);//base case
        for(int i =0; i < len; i++)
        perm(p+s.charAt(i), s.substring(0,i)+s.substring(i+1,len));
    }
}
  
 
 