/**
 * Program to sort a paragraph by the length of its sentences
 */
package Strings;

import java.util.*;

public class sortParagraph {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a paragraph:");
        String a = sc.nextLine().trim();
        a = a + " ";
        int l = a.length(), i, j, x = 0, c = 0, k;
        String s = "";
        String ar2[] = new String[10];
        int arr[] = new int[10];
        for (i = 0; i < l; i++) {// loop to store each sentence as elements in an array
            char ch = a.charAt(i);
            if (ch != '.' && ch != '?' && ch != '!')
                s = s + ch;
            else {
                ar2[x++] = s;
                s = "";
            }
        }
        for (i = 0; i < x; i++) {// counting no. of words in each sentence
            c = 0;
            ar2[0] = " " + ar2[0];
            for (k = 0; k < ar2[i].length(); k++) {
                char ch = ar2[i].charAt(k);
                if (ch == ' ')
                    c++;
                arr[i] = c;
            }
        }
        for (i = 0; i < x - 1; i++) {// bubble sort
            for (j = 0; j < x - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    String t2 = ar2[j];
                    ar2[j] = ar2[j + 1];
                    ar2[j + 1] = t2;
                }
            }
        }
        for (i = 0; i < x; i++) // printing
            System.out.println(ar2[i].trim() + " : " + arr[i]);
    }
}
