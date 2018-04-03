import java.util.Scanner;

public class Twenty_one {

	public static void main(String[] args) {
		int p=0;
		int a=2;
		int c=2;
		int sum=0;
		int d=0;

		System.out.print("사이의 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		p = input.nextInt();//키보드에서 숫자 입력

		while (a<p) {
			while(c<a)
			{
				if (a%c == 0)
				{
					d++;
				}

				c++;

			}
			if(d==0)
			{
				sum = sum + a;
				System.out.println(a);
			}
			a++;
			c=2;
			d=0;
		}

		System.out.println("Sum is " + sum);
	}

}
