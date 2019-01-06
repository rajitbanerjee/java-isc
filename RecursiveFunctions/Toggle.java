/*
 * Program to toggle cases of an input string
 */

import java.util.*;
public class Toggle{
 String str, newstr;
 int len;
 Toggle(){
  str = newstr = "";
  len = 0;
 }
 void inputword(){
  Scanner sc = new Scanner(System.in);
  System.out.println("INPUT: ");
  str = sc.nextLine();
  len = str.length();
 }
 char caseconvert(char ch){
  if(Character.isUpperCase(ch))
   return Character.toLowerCase(ch);
  else return Character.toUpperCase(ch);
 }
 void recchange(int i){
  if(i==len) return;
  newstr += caseconvert(str.charAt(i));
  recchange(i+1);
 }
 void display(){
  System.out.println("Original: " + str);
  System.out.println("Changed: " + newstr);
 }
 static void main(){
  Toggle ob = new Toggle();
  ob.inputword();
  ob.recchange(0);
  ob.display();
 }
}

   