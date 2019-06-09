/**
 * Displays the Calendar of any given month of any given year
 */
import java.util.*;

public class Calendar {
	static Scanner sc = new Scanner(System.in);

	int findMaxDay(String month_name, int year) {
		String months[] = { "", "January", "February", "March", "April", "May", 
			"June", "July", "August", "September", "October", "November", "December" };
		int d[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
			d[2] = 29; // leap year
		int max = 0;
		for (int i = 1; i <= 12; i++)
			if (month_name.equalsIgnoreCase(months[i]))
				max = d[i]; // storing max days in month
		return max;
	}

	int findDayNo(String weekday) {
		String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
			"Friday", "Saturday" };
		int f = 0;
		for (int i = 0; i < 7; i++)
			if (weekday.equalsIgnoreCase(days[i]))
				f = i;// saving week day no.
		return f;
	}

	void fillCalendar(int max, int f, String month_name, int year) {
		int a[][] = new int[6][7];
		int x = 1, z = f;
		for (int i = 0; i < 6; i++) {
			for (int j = f; j < 7; j++)
				if (x <= max)
					a[i][j] = x++;// filling calendar array
			f = 0;
		}
		for (int i = 0; i < z; i++)
			a[0][i] = a[5][i];// moving last row extras to 1st row
		printCalendar(a, month_name, year);
	}

	void printCalendar(int a[][], String month_name, int year) {
		System.out.println("\n");
		System.out.println("\t\t " + month_name + " " + year + "\n");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++)
				if (a[i][j] != 0)
					System.out.print(a[i][j] + "\t");
				else
					System.out.print("\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Calendar ob = new Calendar();
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		System.out.print("Enter the month name(e.g. January): ");
		String month_name = sc.next();
		System.out.print("Enter the week day name(e.g. Sunday) of 1st day of " 
			+ month_name + ": ");
		String weekday = sc.next();
		int max = ob.findMaxDay(month_name, year);
		int f = ob.findDayNo(weekday);
		ob.fillCalendar(max, f, month_name, year);
	}
}
