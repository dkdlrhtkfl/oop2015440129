
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1==str2); //�ּҸ� ���ϴ� ���̹Ƿ� false
		System.out.println(str1.equals(str2)); //���� ���Ҷ� .equals()
		str1 = str2;
		System.out.println(str1==str2); //�ּҸ� �������ָ� true

	}

}