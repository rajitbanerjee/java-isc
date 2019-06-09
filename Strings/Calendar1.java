/**
 * Program to find which day of the week a particular date falls on
 */
package Strings;

import java.util.*;

public class Calendar1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\u000cEnter date as dd/mm/yyyy: ");
        String s1 = sc.nextLine();
        int d = Integer.parseInt(s1.substring(0, s1.indexOf('/')));
        int y = Integer.parseInt(s1.substring(s1.lastIndexOf('/') + 1));
        int m = Integer.parseInt(s1.substring(s1.indexOf('/') + 1, s1.lastIndexOf('/')));
        int a[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int i, s = 0, x = 0, f = 0;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            a[2] = 29;
        if (m > 0 && m <= 12) {
            if (d > 0 && d <= a[m]) {
                f = 1;
            }
        }
        if (f == 0) {
            System.out.println("Invalid date.");
            System.exit(0);
        } else {
            System.out.println("Enter day on which 1st Jan fell that year Eg. MONDAY: ");
            String s2 = sc.nextLine().toUpperCase();
            for (i = 1; i < m; i++)
                s += a[i];
            s += d;
            switch (s2) {
            case "SUNDAY":
                x = 1;
                break;
            case "MONDAY":
                x = 2;
                break;
            case "TUESDAY":
                x = 3;
                break;
            case "WEDNESDAY":
                x = 4;
                break;
            case "THURSDAY":
                x = 5;
                break;
            case "FRIDAY":
                x = 6;
                break;
            case "SATURDAY":
                x = 7;
                break;
            default:
                System.out.println("Wrong input");
                System.exit(0);
            }
            for (i = 2; i <= s; i++) {
                x++;
                if (x == 8)
                    x = 1;
            }
            System.out.println(s1 + " fell on a ");
            switch (x) {
            case 1:
                System.out.print("SUNDAY");
                break;
            case 2:
                System.out.print("MONDAY");
                break;
            case 3:
                System.out.print("TUESDAY");
                break;
            case 4:
                System.out.print("WEDNESDAY");
                break;
            case 5:
                System.out.print("THURSDAY");
                break;
            case 6:
                System.out.print("FRIDAY");
                break;
            case 7:
                System.out.print("SATURDAY");
                break;
            }
        }
    }
}
