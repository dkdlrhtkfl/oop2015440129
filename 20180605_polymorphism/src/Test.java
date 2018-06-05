
public class Test {

	public static void main(String[] args) {
		Dog aDog = new Dog("Tina");
		Cat aCat = new Cat("망고");
		
		aDog.sing();
		aDog.playFetch();
		aCat.sing();
		
		Animal bDog = new Dog("Catina"); //Upcasting
		Animal bCat = new Cat("링고");

		Dog gae = (Dog) bDog;
		gae.playFetch();
		bDog.sing();
//		bDog.playFetch(); //업캐스팅시에는 Animal 즉 부모클래스에 없는 메소드를 사용 불가능
		
		((Dog) bDog).playFetch(); //다운캐스팅하면 자식클래스의 메소드 사용 가능
//		((Cat) bCat).playFetch();
		((Dog) bCat).playFetch(); //playFetch가 없으므로 에러 발생

	}

}
