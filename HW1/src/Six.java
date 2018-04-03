import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("두 자리 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력


		b = a/10;
		c = a%10;

		a = b + c*10;
	
		System.out.print("자릿수를 바꾼 숫자는" + a);
	}

}
