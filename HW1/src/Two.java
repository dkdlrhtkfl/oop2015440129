import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2�� ����");
		
		int a;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�
		
		if(a%2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}
		else {
			System.out.println("¦���Դϴ�");
		}
		System.out.println("=================���α׷� ����===================");

	}
}
