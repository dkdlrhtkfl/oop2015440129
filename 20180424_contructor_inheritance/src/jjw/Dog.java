package jjw;

public class Dog extends Animal {
	public Dog() { //디폴트 생성자
		//super(); // 묵시적으로 사용됨
		System.out.println("Dog 디폴트 생성자");
	}
	public Dog(int a) {
		super(a); // 명시적으로 적어야 정수형 생성자를 부름
		System.out.println("Dog 정수형 생성자");
	}
}
