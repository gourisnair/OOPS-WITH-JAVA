
public class Point {
	private int x;
	private int y;
	
	//Parameterised constructor
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Default constructor
	Point() {
		this.x = 0;
		this.y = 0;
	}
	
	//Defining setters
	public void setX(int xdata) {
		this.x = xdata;
	}
	
	//Defining setters 
	public void setY(int ydata) {
		this.y = ydata;
	}
	
	//Defining getters
	public int getX() {
		return this.x;
	}
	
	//Defining getters
	public int getY() {
		return this.y;
	}
	
	//Defining printers
	public void print() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
	
	//Function to check whether the point is origin
	public boolean isOrigin() {
		if(this.x == 0 && this.y == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Function to check the quadrant
	public int whichQuadrant() {
		if(isOrigin()) {
			return 0;
		} else {
			if(this.x > 0 && this.y > 0) {
				return 1;
			} else {
				if(this.x < 0 && this.y > 0) {
					return 2;
				} else {
					if(this.x < 0 && this.y < 0) {
						return 3;
					} else {
						return 4;
					}
				}
			}
		}
	}
	
	//Function to find x projection
	public void xProjection() {
		System.out.println("(" + this.x + ",0)");
	}
	
	//Function to find y projection
	public void yProjection() {
		System.out.println("(0," + this.y + ")");
	}
	
	//Function for mutable scalar multiplication
	public void scalarMultiplicationMut(int c) {
		x = x * c;
		y = y * c;
	}
	
	//Function for immutable scalar multiplicaition
	public Point scalarMultiplicationImmut(int c) {
		Point q = new Point(c*x, c*y);
		return q;
	}
	
	//Function to find sum of two points
	public Point sum(Point e) {
		return new Point(this.x + e.x , this.y + e.y);
	}
	
	//Function to find slope of a line 
	public double slope(Point e) {
		return (double)((e.y - this.y) / (e.x - this.x));
	}
}
