import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {

		int a=1, b = 1, c = 0;
		System.out.print("정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력

		if (a>9 || a<=0) {
		System.out.print("잘못된 값입니다 새로 정수를 입력하세요 :");

		a = input.nextInt();//키보드에서 숫자 입력

		}
		
		
		while(b<=9) {
		c = a*b;
		System.out.println(a + "X" + b + "=" + c);

		
		
		b++;
		}
		
	}

}
