class Point {
	private int x, y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // Point 참조 변수가 필드로 선언되어 있다. // has-a 클래스로 필드를 가져온다.
	
	// 생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	//중심점 getter
	public Point getPoint() {
		return center;
	}
	
	public void setPoint(Point p) {
		center = p;
	}
}

public class CircleTest {
	public static void main(String[] args){
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p);
		System.out.println(c.getPoint());
		
		System.out.println(new Point(33, 22));
	}
}