import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); //Upcasting: �θ�Ÿ���� ���������� �ڽ�Ÿ�� ��ü�� �����ϴ� ��
//		LinkedList<String> list = new LinkedList<String>();
//		List<String> list = new ArrayList<String>();

		list.add(0, "zero");
		list.add("one");
		list.add("two");
		list.add("three");
		
		list.add(1,"��");
		
		System.out.println(list);
	
	}
}
