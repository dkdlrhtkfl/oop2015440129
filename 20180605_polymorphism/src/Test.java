
public class Test {

	public static void main(String[] args) {
		Dog aDog = new Dog("Tina");
		Cat aCat = new Cat("����");
		
		aDog.sing();
		aDog.playFetch();
		aCat.sing();
		
		Animal bDog = new Dog("Catina"); //Upcasting
		Animal bCat = new Cat("����");

		Dog gae = (Dog) bDog;
		gae.playFetch();
		bDog.sing();
//		bDog.playFetch(); //��ĳ���ýÿ��� Animal �� �θ�Ŭ������ ���� �޼ҵ带 ��� �Ұ���
		
		((Dog) bDog).playFetch(); //�ٿ�ĳ�����ϸ� �ڽ�Ŭ������ �޼ҵ� ��� ����
//		((Cat) bCat).playFetch();
		((Dog) bCat).playFetch(); //playFetch�� �����Ƿ� ���� �߻�

	}

}
