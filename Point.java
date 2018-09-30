import java.lang.Math;

public class Point {
	private double x;
	private double y;

	//Default constructor
	Point(){
		this.x = 0;
		this.y = 0;
	}

	//Parameterized constructor
	Point(double a, double b){
		this.x = a;
		this.y = b;
	}

	//Sets value for x
	public void setX(double a) {
		this.x = a;
	}

	//Sets value for y
	public void setY(double b) {
		this.y = b;
	}

	//Retrieves value of x
	public double getX() {
		return this.x;
	}

	//Retrieves value for y
	public double  getY() {
		return this.y;
	}

	//Method to print the coordinates
	public void print() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}

	//Method to return the coordinates as a string
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	//Method to returns the equation of line
	public String eqnOfLine(Point p) {
		double c = this.y - slope(p) * this.x;
		return "y = " + slope(p) + "x + " + c;
	}

	//Method to check whether the coordinates are origin
	public boolean isOrigin() {
		if(this.x == 0 && this.y == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	//Method to return the quadrant where the coordinate lies
	public int whichQuadrant() {
		if(this.x > 0 && this.y > 0) {
			return 1;
		}
		else if(this.x < 0 && this.y > 0) {
			return 2;
		}
		else if(this.x < 0 && this.y < 0) {
			return 3;
		}
		else if(this.x > 0 && this.y < 0) {
			return 4;
		}
		else {
			return 0;
		}
	}

	//Method to return x-projection
	public Point xProj() {
		Point xp;
		xp = new Point(this.x, 0);
		return xp;
	}

	//Method to return y-projection
	public Point yProj() {
		Point xp;
		xp = new Point(0, this.y);
		return xp;
	}

	//Method to return x-reflection
	public Point xRefl() {
		Point xp;
		xp = new Point(this.x, -this.y);
		return xp;
	}

	//Method to return y-reflection
	public Point yRefl() {
		Point xp;
		xp = new Point(-this.x, this.y);
		return xp;
	}

	//Method to return the scalar product
	public Point scalarMult(double c) {
		Point sp;
		sp = new Point(c * this.x, c * this.y);
		return sp;
	}

	//Method to return the sum of two points
	public Point sumPoint(Point p) {
		Point sp;
		sp = new Point (this.x + p.x, this.y + p.y);
		return sp;
	}

	//Method to return the slope of the coordinates
	public double slope(Point p) {
		return (double)(this.y - p.y) / (this.x - p.x);
	}

	//Method to return the Manhattan distance
	public double manhattanDistance(Point p) {
		return absolute(this.x - p.x) + absolute(this.y - p.y);
	}

	//Method to return the Euclidean distance
	public double euclideanDistance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}

	//Method to return the absolute value
	private static double absolute(double n) {
		if (n<0) {
			return -1*n;
		}
		else
			return n;
	}

}
