import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("�� �ڸ� ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�


		b = a/10;
		c = a%10;

		a = b + c*10;
	
		System.out.print("�ڸ����� �ٲ� ���ڴ�" + a);
	}

}
