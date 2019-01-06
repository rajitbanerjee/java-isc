/*
 * Implement a simple Stack data structure
 */
import java.util.*;
public class Stack{
    int top, max, p, stk[];
    public Stack(){
     top = -1;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter max:");
     p = sc.nextInt();
     max = p;
     stk = new int[p];
    }
    void push(){
     ++top;
     if(top == max){
         System.out.println("Stack Overflow!");
         top--;
         return;
        }
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number to push: ");
     int n = sc.nextInt();
     stk[top] = n;
    }
    void pop(){
      if(top == -1){
        System.out.println("Stack Underflow!");
        return;
         }
      System.out.println("Element popped: " + stk[top]);
      top--;
    }
    void display(){
      if(top==-1){
        System.out.println("Stack is empty!");
        return;
      }
      else{
        System.out.println("\nItems in the stack: ");
        for(int i = top; i>=0; i--)
        System.out.print(stk[i] + " ");
      }
    }
    public static void main(String[]args){
        Stack S = new Stack();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int ch  = sc.nextInt();
            switch(ch){
                case 1: S.push(); break;
                case 2: S.pop(); break;
                case 3: S.display(); break;
                case 4: System.exit(0); break;
                default: System.out.println("Wrong input.");
            }
        }
    }
}
