package jjw2;

import jjw1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2;		// age is private field
		
		//�ٸ� ��Ű���� Ŭ�󽺸� ����Ϸ��� 
		//1. ��Ű����.Ŭ�󽺸�
		//jjw1.Dog aDog = new jjw1.Dog(); 
		//2. import jjw1.* �� ��� 
		Dog aDog = new Dog();
		aDog.name = "happy";

		// aDog.nickName = "kk"; //nickName�� ��Ű�� ���������̹Ƿ� jjw1������ public���� ����
		Animal aa = new Animal();
		
		Rosemary rr = new Rosemary();
		
	}

}
