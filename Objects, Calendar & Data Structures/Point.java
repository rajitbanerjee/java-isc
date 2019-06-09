/**
 * Find the mid point between two other given points
 */
import java.util.*;

public class Point {
	static Scanner sc = new Scanner(System.in);
	double x, y;

	Point() {
		x = 0;
		y = 0;
	}

	void readPoint() {
		System.out.println("Enter x and y: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
	}

	Point midPoint(Point A, Point B) {
		Point M = new Point();
		M.x = (A.x + B.x) / 2;
		M.y = (A.y + B.y) / 2;
		return M;
	}

	void displayPoint() {
		System.out.println("Mid-point: P(" + x + ", " + y + ")");
	}

	public static void main(String[] args) {
		Point Ob1 = new Point();
		Point Ob2 = new Point();
		Ob1.readPoint();
		Ob2.readPoint();
		Point Ob3 = new Point();
		Ob3 = Ob3.midPoint(Ob1, Ob2);
		Ob3.displayPoint();

	}
}
