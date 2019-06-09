/**
 * Program to check palindrome number
 */
package RecursiveFunctions;

import java.util.*;

public class Palin {
    static int num, revnum;
    static Scanner sc = new Scanner(System.in);

    public Palin() {
        num = 0;
        revnum = 0;
    }

    void accept() {
        System.out.println("Enter a number to check palindrome: ");
        num = sc.nextInt();
    }

    int reverse(int y) {
        if (y == 0)
            return 0;
        revnum = revnum * 10 + y % 10;
        reverse(y / 10);
        return revnum;
    }

    void check() {
        if (reverse(num) == num)
            System.out.println("Palindrome");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Palin P = new Palin();
        P.accept();
        P.check();
    }
}
