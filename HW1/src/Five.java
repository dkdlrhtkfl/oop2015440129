import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		System.out.println("Choose one of the following");
		System.out.println("Apple");
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Peach");

		
		
		System.out.println("Enter your choice here");

		Scanner input = new Scanner(System.in);
		a = input.next();//키보드에서 string 입력

		
		System.out.println("------------------");
		System.out.println("Your choice is " + a);



		System.out.println("=================프로그램 종료===================");
	}

}
