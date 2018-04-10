
public class Point {
	//fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ("(" + this.x + ", " + this.y + ")");
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	public double distance() {
		//거리 반환
		return Math.sqrt(x*x + y*y);
	}
	//method overloading: 메소드명은 distance로 같지만 매개변수가 달라 호출할 구분할 수 있다.
	public double distance(Point p) {
		return Math.sqrt( (this.x - p.getX() )* (this.x - p.getX() )
				+ (this.y - p.getY() ) * (this.y - p.getY() ) );
	}
	
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
