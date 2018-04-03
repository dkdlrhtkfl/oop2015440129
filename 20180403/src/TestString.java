
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1==str2); //주소를 비교하는 것이므로 false
		System.out.println(str1.equals(str2)); //값을 비교할땐 .equals()
		str1 = str2;
		System.out.println(str1==str2); //주소를 같게해주면 true

	}

}
