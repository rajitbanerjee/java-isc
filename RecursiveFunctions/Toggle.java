/**
 * Program to toggle cases of an input string
 */
package RecursiveFunctions;

import java.util.*;

public class Toggle {
    String str, newStr;
    int len;
    static Scanner sc = new Scanner(System.in);

    Toggle() {
        str = newStr = "";
        len = 0;
    }

    void inputWord() {
        
        System.out.println("INPUT: ");
        str = sc.nextLine();
        len = str.length();
    }

    char caseConvert(char ch) {
        if (Character.isUpperCase(ch))
            return Character.toLowerCase(ch);
        else
            return Character.toUpperCase(ch);
    }

    void recChange(int i) {
        if (i == len)
            return;
        newStr += caseConvert(str.charAt(i));
        recChange(i + 1);
    }

    void display() {
        System.out.println("Original: " + str);
        System.out.println("Changed: " + newStr);
    }

    static void main() {
        Toggle ob = new Toggle();
        ob.inputWord();
        ob.recChange(0);
        ob.display();
    }
}