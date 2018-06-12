import java.util.*;

public class Sweep {

	public static void main(String[] args) {
//		Set<String> strs = new TreeSet<>(); //알파벳,가나다 순서로 정렬되어 저장
		Set<String> strs = new LinkedHashSet<>(); //넣은 순서대로 정렬
//		Set<String> strs = new HashSet<>(); //해쉬함수 순서, 즉 순서를 알 수 없음
		//기본적으로 메소드 add(), remove(), sweep ...
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//첫 번째 방법: Iterator 사용
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { //끝까지 훑다
			String str = e.next(); //하나씩 빼낸다
			System.out.println(str);
		}
		
		//두 번째 방법: for() 반복문 사용
		for (String str1: strs) {//for (요소타입 참조변수: 콜렉션변수)
			System.out.println(str1);
		}
	}
}
