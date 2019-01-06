/*
 * Perform binary search recursively
 */

import java.util.*;
public class BinarySearch{
    static int f = 0;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,j;
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        a[i] = sc.nextInt();
        for(i=0;i<n-1;i++){
         for(j=0;j<n-1-i;j++){
             if(a[j]>a[j+1]){
                 int t = a[j];
                 a[j] = a[j+1];
                 a[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)
        System.out.print(a[i] + " ");
        System.out.println("\nEnter element to be searched:");
        int k = sc.nextInt();
        BinarySearch b = new BinarySearch();
        int ans = b.bs(a,k,0,n-1);
        if(f == 1) System.out.println("Element found at position " + (ans+1));
        else System.out.println("Not found.");
    }
    static int bs(int a[], int k, int min, int max){
     f = 0;
     if(min>max)
      return -1;
     int mid = (min+max)/2;
     if(k>a[mid])
      return bs(a,k,mid+1,max);
     else if(k<a[mid])
      return bs(a,k,min,mid-1);
     else{
      f=1;
      return mid;
     }
    }
}
        
           