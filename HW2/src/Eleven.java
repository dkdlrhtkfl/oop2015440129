import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		
		int a, i=2;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();//Ű���忡�� ���� �Է�

		while(a!=0)
		{
			while(i<a) {
				if(a%i == 0){
					System.out.println(i);
				}
				i++;
				if(i==a) {
					System.out.print("������ �Է��Ͻÿ�: ");
					a = input.nextInt();//Ű���忡�� ���� �Է�
					i=2;
				}
			}
		}

			System.out.println("-------�ڵ�����-------");

	}
}
