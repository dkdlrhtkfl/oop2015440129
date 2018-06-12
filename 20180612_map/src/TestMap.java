import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //해쉬함수 순서, 즉 순서를 알 수 없음
//		Map<String, String> map = new TreeMap<>(); //키의 알파벳 순서
//		Map<String, String> map = new LinkedHashMap<>(); //집어넣은 순서

		//추가: .put(key, value), 특정 키의 value: value = .get(key)
		map.put("재이니", "청아대");
		map.put("트럼프", "배각관");
		map.put("정으니", "피앙");
		
		System.out.println(map.get("재이니"));
		
//		훑는 방법 1
//		Set<String> set = map.keySet(); //map.keySet(): map에 저장된 엔트리(키,값) 중 키만 모은 셋
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) { //끝까지 훑다
			String key = itr.next(); //하나씩 빼낸다
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
		}
		
//		훑는 방법 2: 키셋을 만들어 for()문으로 반복
		for(String key : map.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
		}
		
//		훑는 방법 3: 엔트리셋(키와 값이 같이 나오는 셋)을 만드는 방법
		for(Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("키: %s, 값: %s", elem.getKey(), elem.getValue()));
		}
	}
}
