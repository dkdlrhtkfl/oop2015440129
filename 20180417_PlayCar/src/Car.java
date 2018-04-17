
public class Car {
	//Field
	private String color;
	private int speed;

	//��������(static field)
	public static int numberOfCars = 0;
	
	//�����޼ҵ�� ���������� ���� ����
	public static void print() {
//		System.out.println(this.color + "," + this.speed); error
		System.out.println(numberOfCars); 
		}
	
	//Constructor (������): �޼ҵ���� Ŭ�� �̸��� ����, ��ȯ���� ����
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
		numberOfCars++;
	}
	
	//���� �����ڸ� �������� ������, �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������ �����ڸ� �� ���̶� �����Ѵٸ�, �ڹٴ� �ƹ��ϵ� �� �Ѵ�.
	Car() {
		this.color = "white";
		this.speed = 60;
		
		numberOfCars++;
		}
	
	
	//Methods
	public String toString() {
		return "Color is " + this.color + ", Speed is " + this.speed;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
