import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		int a;
		System.out.print("0~100 ������ ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�
		
		
		if(a>=80) 
			System.out.println("A");
		else if(a>=60)
			System.out.println("B");
		else if(a>=40)
			System.out.println("C");
		else if(a>=20)
			System.out.println("D");
		else
			System.out.println("E");



		System.out.println("=================���α׷� ����===================");
	}

}
