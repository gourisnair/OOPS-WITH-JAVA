
public class Driver {
	public static void main(String[] args) {
		/*Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		
		System.out.println("(" + p1.getX() + "," + p1.getY() + ")");
		p1.print();
		
		System.out.println(p1);                    //To check printing an object
		
		Point p2 = new Point();
		p2.setX(2);
		p2.setY(3);
		
		//To check equality of two objects
		if(p1 == p2) {
			System.out.println("Same ");
		} else {
			System.out.println("Different");
		}
		
		Point p0 = new Point();
		p0.print();
		
		
		Point p = new Point(4, 7);
		System.out.println(p.isOrigin());
		
		Point q = new Point();
		System.out.println(q.isOrigin());
		
		Point p = new Point();
		System.out.println(p.whichQuadrant());
		
		Point q = new Point(4, 3);
		System.out.println(q.whichQuadrant());
		
		q.setX(-8);
		System.out.println(q.whichQuadrant());
		
		q.setY(q.getY() * -1);
		System.out.println(q.whichQuadrant());
		
		q.setX(q.getX() / -2);
		System.out.println(q.whichQuadrant());
		
		Point a = new Point(2, 3);
		a.xProjection();
		a.yProjection();
		
		Point b = new Point(2, 4);
		b.scalarMultiplicationMut(5);
		b.print();
		
		Point c = b.scalarMultiplicationImmut(5);
		c.print();
		
		b = b.scalarMultiplicationImmut(6);             //Non-mutable way to produce mutable effect
		b.print();*/
		
		Point d = new Point(2, 7);
		Point e = new Point(1, 3);
		Point f = d.sum(e);
		f.print();
		
		System.out.println(d.slope(e));
		
		
	}
}
