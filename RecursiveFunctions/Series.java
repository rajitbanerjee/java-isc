/**
 * Sum of series: (x^2) + (x^4)/3! + (x^6)/5! + ... + (x^n)/(n-1)!
 */
package RecursiveFunctions;

import java.util.*;

public class Series {
    static int x, n;
    double sum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("x and n:");
        x = sc.nextInt();
        n = sc.nextInt();
        Series ob = new Series();
        ob.calculate();
        ob.display();
    }

    double findFact(int m) {
        if (m == 0)
            return 1;
        return m * findFact(m - 1);
    }

    double findPower(int x, int y) {
        if (y == 0)
            return 1;
        return x * findPower(x, y - 1);
    }

    void calculate() {
        int i;
        for (i = 2; i <= n; i = i + 2) {
            sum += findPower(x, i) / findFact(i - 1);
        }
    }

    void display() {
        System.out.println(sum);
    }
}