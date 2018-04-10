
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
		//�Ÿ� ��ȯ
		return Math.sqrt(x*x + y*y);
	}
	//method overloading: �޼ҵ���� distance�� ������ �Ű������� �޶� ȣ���� ������ �� �ִ�.
	public double distance(Point p) {
		return Math.sqrt( (this.x - p.getX() )* (this.x - p.getX() )
				+ (this.y - p.getY() ) * (this.y - p.getY() ) );
	}
	
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
