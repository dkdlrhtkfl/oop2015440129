import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //�ؽ��Լ� ����, �� ������ �� �� ����
//		Map<String, String> map = new TreeMap<>(); //Ű�� ���ĺ� ����
//		Map<String, String> map = new LinkedHashMap<>(); //������� ����

		//�߰�: .put(key, value), Ư�� Ű�� value: value = .get(key)
		map.put("���̴�", "û�ƴ�");
		map.put("Ʈ����", "�谢��");
		map.put("������", "�Ǿ�");
		
		System.out.println(map.get("���̴�"));
		
//		�ȴ� ��� 1
//		Set<String> set = map.keySet(); //map.keySet(): map�� ����� ��Ʈ��(Ű,��) �� Ű�� ���� ��
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) { //������ �ȴ�
			String key = itr.next(); //�ϳ��� ������
			System.out.println(String.format("Ű: %s, ��: %s", key, map.get(key)));
		}
		
//		�ȴ� ��� 2: Ű���� ����� for()������ �ݺ�
		for(String key : map.keySet()) {
			System.out.println(String.format("Ű: %s, ��: %s", key, map.get(key)));
		}
		
//		�ȴ� ��� 3: ��Ʈ����(Ű�� ���� ���� ������ ��)�� ����� ���
		for(Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println(String.format("Ű: %s, ��: %s", elem.getKey(), elem.getValue()));
		}
	}
}
