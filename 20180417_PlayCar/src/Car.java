
public class Car {
	//Field
	private String color;
	private int speed;

	//정적변수(static field)
	public static int numberOfCars = 0;
	
	//정적메소드는 정적변수만 접근 가능
	public static void print() {
//		System.out.println(this.color + "," + this.speed); error
		System.out.println(numberOfCars); 
		}
	
	//Constructor (생성자): 메소드명이 클라스 이름과 동일, 반환형이 없다
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
		numberOfCars++;
	}
	
	//만약 생성자를 정의하지 않으면, 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
	//하지만 생성자를 한 번이라도 정의한다면, 자바는 아무일도 안 한다.
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
