import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		int month, day, m=0, sum_m=0, i=1;
		System.out.print("���� �Է��Ͻÿ�: ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("���� �Է��Ͻÿ�: ");
		day = input.nextInt();//Ű���忡�� ���� �Է�

		while(i<=month) {
			
			switch(month)
			{
				case 1:
					m=0;
				break;

				case 3:
					m=28;
				break;
			
				case 5:
				case 7:
				case 10:
				case 12:
					m=30;
				break;

				default:
					m=31;
				break;

			}
			sum_m = sum_m + m;
			month--;
			m=0;
		}
		sum_m = sum_m + day;
		System.out.print(sum_m + "��");

	}
}
