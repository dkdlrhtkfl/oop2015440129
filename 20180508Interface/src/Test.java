import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass�̸� Ÿ���� �޶� ������ ����
		Animal aaa = new Dog();
//		Animal aaa = (Animal) new Dog(); //�ٷ� ���ٰ� �����ϰ� ����ȯ(Upcasting)�� ���� ����� �ڵ��̴�.
		aaa.sing(); //Overriding�� �޼ҵ带 ȣ���ϸ�, subclass�� �޼ҵ带 �����Ѵ�
		aaa = new Cat();
		aaa.sing();
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. superClass SupeRefVar = new SubClass();
		//3. superRefVar.overridedMethod(): ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog")) {
			aaa = new Dog();
		}
		else {
			aaa = new Cat();
		}
		aaa.sing(); //���� ���ε�(Dynamic Binding): ���α׷� ���� �� ȣ���� �޼ҵ带 ����
		
		
		
		int a = (int) 3.1; //�� ��ȯ(type casting)
		System.out.println(a);
	}
}
