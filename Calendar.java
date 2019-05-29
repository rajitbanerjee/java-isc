/*
 * Print the calendar of an input month in 2016
 */
import java.util.*;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = 'Y';
        System.out.println("\nCalendar of the year 2016.");
        while (op != 'n' && op != 'N') {
            int i, j, sum = 0, k = 0;
            System.out.println("Enter month:");
            String in = sc.next().toUpperCase();
            int n = 0;
            String a1[] = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", 
                "AUG", "SEP", "OCT", "NOV", "DEC" };
            String a2[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", 
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
            int l = in.length();
            if (l <= 2)
                n = Integer.valueOf(in);

            for (i = 0; i < 12; i++)
                if (in.equals(a1[i]) || in.equals(a2[i]))
                    n = i + 1;

            System.out.println(a2[n - 1] + ", 2016.");
            //number of days in each month
            int m[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            //starting day number of each month
            int d[] = { 5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };

            for (i = 0; i < n; i++)
                sum = sum + m[i];

            int a[][] = new int[6][7];
            for (i = 0; i < 6; i++) {
                for (j = 0; j < 7; j++) {
                    if (j < d[n - 1] && i == 0)
                        a[i][j] = 0;
                    else
                        a[i][j] = ++k;
                    if (k > m[n])
                        a[i][j] = 0;
                }
            }
            System.out.println("\nSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
            for (i = 0; i < 6; i++) {
                for (j = 0; j < 7; j++) {
                    if (a[i][j] == 0)
                        System.out.print("\t");
                    else
                        System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Proceed? (Y/N)");
            op = sc.next().charAt(0);
        }
        sc.close();
    }
}
