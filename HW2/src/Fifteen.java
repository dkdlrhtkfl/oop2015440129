import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		int a, b=0, i=0;
		System.out.print("1~100 사이의 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력

		while(a!=b)
		{
			System.out.print("정수를 입력하시오: ");
			b = input.nextInt();//키보드에서 숫자 입력

			if(a>b)
			{
				System.out.println("입력하신 숫자보다 큽니다");
				i++;
			}
			else if(a<b)
			{
				System.out.println("입력하신 숫자보다 작습니다");
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
		System.out.println("정답입니다!");
	}

}
