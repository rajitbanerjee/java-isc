/*
 * Demonstrate recursion and stack concept (statements left after recursive call)
 */
package RecursiveFunctions;
public class Recursion{
    void print(int a){
        if(a<0) return;
        System.out.print(a);
        print(a-2);
        System.out.print(a);
    }
}

