package jjw;

public class Dog extends Animal {
	public Dog() { //����Ʈ ������
		//super(); // ���������� ����
		System.out.println("Dog ����Ʈ ������");
	}
	public Dog(int a) {
		super(a); // ��������� ����� ������ �����ڸ� �θ�
		System.out.println("Dog ������ ������");
	}
}
