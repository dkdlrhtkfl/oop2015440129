import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		int a;
		System.out.print("0~100 사이의 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력
		
		
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



		System.out.println("=================프로그램 종료===================");
	}

}
