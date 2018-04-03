
public class Loop {

	public static void main(String[] args) {
		//1~10 정수를 화면에 출력
		int i = 1; //1. 루프변수 초기화
	
		while(i<=10) { //2. 루프 조건식
			System.out.println(i); //3. 루프문
			i++; //4. 루프변수 변화
		}
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}

		
		//1부터 10까지 더하기
		i=1; //1. 루프변수 초기화
		int sum=0;
		while(i<=10) { //2. 루프 조건식
			sum=sum+i; //3. 루프문
			i++; //4. 루프변수 변화
		}
		
		System.out.println("Sum = " + sum);

		for(i=1, sum=0; i<=10; i++) {
			sum=sum+i;
		}		
		System.out.println("Sum = " + sum);

		
		String str = "hello darkness my old friend";
		int count = 0;
		for(i=0; i < str.length(); i++) { //i가 스트링의 길이와 같은 크기가 될때까지
			if(str.charAt(i) != 'l') //스트링의 i번째 위치가 l과 같은지 판단
				continue; //다르면 다시 위로
				
			count++;
		}
		System.out.println("문장에 발견된 l의 개수는 " + count);

		
		System.out.println("=================프로그램 종료===================");

	}

}
