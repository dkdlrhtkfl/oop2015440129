import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("ù ��° ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�� ��° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�� ��° ������ �Է��Ͻÿ�: ");
		c = input.nextInt();//Ű���忡�� ���� �Է�
		
		
		if(a>b && a>c) 
			System.out.println(a);
		else if(b>c && b>a)
			System.out.println(b);
		else
			System.out.println(c);



		System.out.println("=================���α׷� ����===================");
	}

}
