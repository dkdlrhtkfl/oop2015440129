package jjw1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		//tina.IDN = "30942394";       // IDN is private field
		tina.nickName = "abc";
		
		tina.publicField = "U2";
		//tina.privateField = "Sting";
		tina.packageField = "Ed";		//��Ű�� �ʵ�� ��� ����
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
		
	}

}
