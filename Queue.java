import java.util.*;
public class Queue{
   static Scanner sc = new Scanner(System.in);
   static int f, r, a[], max;
   public Queue(int m){
     f = r = -1;
     max = m;
     a = new int[max];
   }
   static void enqueue(){
       if(f==-1 && r==-1)
       f = r = 0;
       else if(f!=-1 && r!=max)
       r++;
       if(r==max){
           System.out.println("Overflow!");
           r--;
           return;
       }
       System.out.println("Enter element to enqueue: ");
       int n = sc.nextInt();
       a[r] = n;
   }
   static void dequeue(){
       if(f==-1 || f==max){
           System.out.println("Underflow!");
           return;
        }
       else if(f==0 && r==0){
           System.out.println("Element dequeued: " + a[f]);
           f = r = -1;
        }
       else{
           System.out.println("Element dequeued: " + a[f]);
           f++;
        }
    }
   static void display(){
       if(f==-1 && r==-1 || f==max || r==max){
           System.out.println("Queue is empty.");
           return;
        }
       else{
           System.out.println("Elements in queue: ");
           for(int i = f; i<=r ; i++)
            System.out.print(a[i] + " ");
        }
    }
   public static void main(String[]args){
       System.out.println("Enter max: "); int x = sc.nextInt();
       Queue q = new Queue(x);
       while(true){
           System.out.println("\n1. Enqueue");
           System.out.println("2. Dequeue");
           System.out.println("3. Display");
           System.out.println("4. Exit");
           System.out.println("Enter your choice: "); int ch = sc.nextInt();
           switch(ch){
               case 1: q.enqueue(); break;
               case 2: q.dequeue(); break;
               case 3: q.display(); break;
               case 4: return;
               default: System.out.println("Wrong input.");
            }
        }
    }
}
           
           
            
    
        
       