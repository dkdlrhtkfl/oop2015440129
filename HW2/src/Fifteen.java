import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		int a, b=0, i=0;
		System.out.print("1~100 ������ ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�

		while(a!=b)
		{
			System.out.print("������ �Է��Ͻÿ�: ");
			b = input.nextInt();//Ű���忡�� ���� �Է�

			if(a>b)
			{
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�");
				i++;
			}
			else if(a<b)
			{
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�");
				i++;
			}
			else
			{
				break;
			}
			if(i==10)
			{
				System.out.println("Game Over");
				a=b;
			}
		}
		System.out.println("�����Դϴ�!");
	}

}
