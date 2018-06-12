import java.util.*;

public class Sweep {

	public static void main(String[] args) {
//		Set<String> strs = new TreeSet<>(); //���ĺ�,������ ������ ���ĵǾ� ����
		Set<String> strs = new LinkedHashSet<>(); //���� ������� ����
//		Set<String> strs = new HashSet<>(); //�ؽ��Լ� ����, �� ������ �� �� ����
		//�⺻������ �޼ҵ� add(), remove(), sweep ...
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//ù ��° ���: Iterator ���
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { //������ �ȴ�
			String str = e.next(); //�ϳ��� ������
			System.out.println(str);
		}
		
		//�� ��° ���: for() �ݺ��� ���
		for (String str1: strs) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			System.out.println(str1);
		}
	}
}
