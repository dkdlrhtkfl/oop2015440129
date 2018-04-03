import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("첫 번째 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력
		System.out.print("두 번째 정수를 입력하시오: ");
		b = input.nextInt();//키보드에서 숫자 입력
		System.out.print("세 번째 정수를 입력하시오: ");
		c = input.nextInt();//키보드에서 숫자 입력
		
		
		if(a>b && a>c) 
			System.out.println(a);
		else if(b>c && b>a)
			System.out.println(b);
		else
			System.out.println(c);



		System.out.println("=================프로그램 종료===================");
	}

}
