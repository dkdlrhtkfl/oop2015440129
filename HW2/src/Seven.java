import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		int a=1, b = 0;
		
		while(a!=0) {
		System.out.print("정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		b = b + a;
		}
		
		System.out.print("합은 " + b);

		
	}

}
