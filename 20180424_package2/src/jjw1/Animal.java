package jjw1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//���� ��Ű�� �������� public
	//Ÿ ��Ű�������� private�̳� ����� ��
	protected String protectedField;
	
	
	public Animal () {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
}
