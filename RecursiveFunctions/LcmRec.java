/*
 * Calculate LCM of 2 numbers
 */

import java.util.*;
public class LcmRec{
    int x, y;
    LcmRec(int xx, int yy){
     x = xx;
     y = yy;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.s:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        LcmRec ob = new LcmRec(x, y);
        ob.show();
    }   
    int lcm(int x, int y, int i){
     if(i%x==0&&i%y==0)
      return i;
     return lcm(x, y, ++i);
    }
    void show(){
     System.out.println(lcm(x, y, 2));
    }
}
    
        