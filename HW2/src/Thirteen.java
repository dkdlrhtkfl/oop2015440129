import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		int month, day, m=0, sum_m=0, i=1;
		System.out.print("월을 입력하시오: ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();//키보드에서 숫자 입력
		System.out.print("일을 입력하시오: ");
		day = input.nextInt();//키보드에서 숫자 입력

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
		System.out.print(sum_m + "일");

	}
}
