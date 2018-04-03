import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		int score, good=0, bad=0;
		System.out.print("성적을 입력하세요:");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();//키보드에서 숫자 입력
		System.out.println("성적은 " + score + "점입니다.");

		//성적이 60점 이상이면 합격, 미만이면 불합격 출력
		if(score>=60)
		{
			System.out.println("합격입니다.");
			good++;
		}//복합문(Compound Statement): 여러 문장을 중괄호{}로 묶어 하나의 문장으로 처리
		else
		{
			System.out.println("불합격입니다.");
			bad++;
		}
		//성적이 80이상이면 A, 60이상이면 B, 60미만이면 F
		if(score>=80) {
			System.out.println("A");
		}
		else if(score>=60) {
			System.out.println("B");
		}
		else {
			System.out.println("F");
		}
		
		//0=없음, 1=하나, 2=둘, 기타의 경우 많음 출력
		switch(score) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
		System.out.println("=================프로그램 종료===================");
 	}

}
