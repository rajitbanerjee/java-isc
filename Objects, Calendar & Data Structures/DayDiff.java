/**
 * Find difference between two dates
 */
import java.util.*;

public class DayDiff {
	static int f = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
    	System.out.println("Enter two dates in dd/mm/yyyy format:");
    	String a = sc.nextLine();
    	int d1 = Integer.valueOf(a.substring(0, a.indexOf('/')));
    	int m1 = Integer.valueOf(a.substring(a.indexOf('/') + 1, a.lastIndexOf('/')));
    	int y1 = Integer.valueOf(a.substring(a.lastIndexOf('/') + 1));
    	String b = sc.nextLine();
    	int d2 = Integer.valueOf(b.substring(0, b.indexOf('/')));
    	int m2 = Integer.valueOf(b.substring(b.indexOf('/') + 1, b.lastIndexOf('/')));
		int y2 = Integer.valueOf(b.substring(b.lastIndexOf('/') + 1));
	
    	int day1[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    	int day2[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    	if (leapCheck(y1) > 0)
    		day1[2] = 29;
    	if (leapCheck(y2) > 0)
    		day2[2] = 29;
    	int i, j, sum = 0;
    	if (y1 != y2) {
    		for (i = y1; i < y2; i++) {
        		sum += leapCheck(i);
      		}
      		sum += 365 * (y2 - y1);
    	}
    	int s1 = 0, s2 = 0;
    	for (i = 0; i < m1; i++) {
      		s1 += day1[i];
    	}
    	s1 = s1 + d1;
    	for (j = 0; j < m2; j++) {
      		s2 += day2[j];
    	}
    	if (y1 != y2)
      		s2 = s2 + d2 + sum;
    	else
      		s2 = s2 + d2 + sum;
		System.out.println("\nDifference = " + ((int) Math.max(s1, s2) - 
			(int) Math.min(s1, s2)) + " days");
	}

	static int leapCheck(int y) {
  		f = 0;
    	if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			f++;
		}
    	return f;
  	}
}