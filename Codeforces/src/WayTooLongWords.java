import java.util.Scanner;

class Point {
	public int x,y;

	public Point( int x, int y) {
		
	this.x=x;
	this.y=y;
	
	}
	
	
}

public class WayTooLongWords {
	
		public static void main(String args[])
		{
			Point y = new Point(2,4);
			Point z = new Point(2,4);
			boolean s=coin(y, z);
			System.out.println(s);
			
		}
		
		public  static boolean coin(Point a,Point b)
		{
			return((a.x==b.x) && (a.y==b.y));
			
		}
		
		
	}