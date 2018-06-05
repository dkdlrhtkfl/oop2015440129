import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); //Upcasting: 부모타입의 참조변수도 자식타입 객체를 참조하는 것
//		LinkedList<String> list = new LinkedList<String>();
//		List<String> list = new ArrayList<String>();

		list.add(0, "zero");
		list.add("one");
		list.add("two");
		list.add("three");
		
		list.add(1,"돌");
		
		System.out.println(list);
	
	}
}
