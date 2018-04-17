
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.cos(0));
		//Math.cos()객체를 생성하지 않고 사용할 수 있는 메소드
		Car.print();
		Car myCar = new Car("Space Blue", 300);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		System.out.println(myCar.numberOfCars);
		Car yourCar = new Car();
		//정적 변수는 클라스명, 정적정수명으로도 접근할 수 있다.
		System.out.println(yourCar.numberOfCars);

		System.out.println(myCar);
		System.out.println(yourCar);
		
	}

}
