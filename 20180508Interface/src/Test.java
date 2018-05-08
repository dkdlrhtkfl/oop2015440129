import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
		//우변의 클라스가 좌변 클라스의 subclass이면 타입이 달라도 문제가 없다
		Animal aaa = new Dog();
//		Animal aaa = (Animal) new Dog(); //바로 윗줄과 동일하게 형변환(Upcasting)한 것을 명시한 코드이다.
		aaa.sing(); //Overriding한 메소드를 호출하면, subclass의 메소드를 수행한다
		aaa = new Cat();
		aaa.sing();
		//다형성(polymorphism)
		//1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		//2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		//3. superClass SupeRefVar = new SubClass();
		//3. superRefVar.overridedMethod(): 객체의 클라스가 구현한 메소드를 실행한다.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog")) {
			aaa = new Dog();
		}
		else {
			aaa = new Cat();
		}
		aaa.sing(); //동적 바인딩(Dynamic Binding): 프로그램 수행 시 호출할 메소드를 결정
		
		
		
		int a = (int) 3.1; //형 변환(type casting)
		System.out.println(a);
	}
}
