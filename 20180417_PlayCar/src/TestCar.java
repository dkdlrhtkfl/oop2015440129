
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.cos(0));
		//Math.cos()��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		Car.print();
		Car myCar = new Car("Space Blue", 300);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		System.out.println(myCar.numberOfCars);
		Car yourCar = new Car();
		//���� ������ Ŭ�󽺸�, �������������ε� ������ �� �ִ�.
		System.out.println(yourCar.numberOfCars);

		System.out.println(myCar);
		System.out.println(yourCar);
		
	}

}
