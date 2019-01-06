/*
 * Perform linear search recursively
 */

public class Linear{
    int a[] = {2,5,6,4,10};
    int find(int n, int i){
        if(i == a.length) 
            return -1; //not found
        if(a[i]==n) 
            return (i+1); //found at index i, which is position i+1
        return 
            find(n, i+1); //recursive call
    }
    void main(int n){
        System.out.println(find(n, 0));
    }
}
  
  
  