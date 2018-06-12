import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException{
//		Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); //알파벳, 가나다 순으로 저장됨
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");

		while (!strs.isEmpty()) {//for (요소타입 참조변수: 콜렉션변수)
			
			System.out.println(strs.remove()); //큐 맨 앞에서부터 요소를 제거하고 반환
			Thread.sleep(1000);
		}
	}

}
