import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {

		int a=1, b = 1, c = 0;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�

		if (a>9 || a<=0) {
		System.out.print("�߸��� ���Դϴ� ���� ������ �Է��ϼ��� :");

		a = input.nextInt();//Ű���忡�� ���� �Է�

		}
		
		
		while(b<=9) {
		c = a*b;
		System.out.println(a + "X" + b + "=" + c);

		
		
		b++;
		}
		
	}

}
