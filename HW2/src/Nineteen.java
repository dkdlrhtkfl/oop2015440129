import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		int p=0;
		int a=2;
		int c=0;

		System.out.print("1~100 ������ ������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		p = input.nextInt();//Ű���忡�� ���� �Է�

		while (a<=(p-1)) {
			if (p%a == 0)
			{
				c++;
			}
			a++;
		}
		if (c>=1)
		{
			System.out.println(p + " is not prime number.");
		}
		else
		{
			System.out.println(p + " is prime number.");
		}
	}

}
