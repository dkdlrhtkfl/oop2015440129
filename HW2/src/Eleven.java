import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		
		int a, i=2;
		System.out.print("정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//키보드에서 숫자 입력

		while(a!=0)
		{
			while(i<a) {
				if(a%i == 0){
					System.out.println(i);
				}
				i++;
				if(i==a) {
					System.out.print("정수를 입력하시오: ");
					a = input.nextInt();//키보드에서 숫자 입력
					i=2;
				}
			}
		}

			System.out.println("-------코드종료-------");

	}
}
