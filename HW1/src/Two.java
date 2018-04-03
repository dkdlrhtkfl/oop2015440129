import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2번 문제");
		
		int a;
		System.out.print("정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력
		
		if(a%2 == 1) {
			System.out.println("홀수입니다");
		}
		else {
			System.out.println("짝수입니다");
		}
		System.out.println("=================프로그램 종료===================");

	}
}
