import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		System.out.print("ù ��° ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�� ��° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();//Ű���忡�� ���� �Է�
		
		if(a>b) {
			System.out.println("a�� Ů�ϴ�");
		}
		else {
			System.out.println("b�� Ů�ϴ� ");
		}
		System.out.println("=================���α׷� ����===================");

	}

}
