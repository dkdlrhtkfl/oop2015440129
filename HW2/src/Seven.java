import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

		int a=1, b = 0;
		
		while(a!=0) {
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		b = b + a;
		}
		
		System.out.print("���� " + b);

		
	}

}
