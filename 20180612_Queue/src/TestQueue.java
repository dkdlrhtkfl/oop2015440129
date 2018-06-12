import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException{
//		Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); //���ĺ�, ������ ������ �����
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");

		while (!strs.isEmpty()) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			
			System.out.println(strs.remove()); //ť �� �տ������� ��Ҹ� �����ϰ� ��ȯ
			Thread.sleep(1000);
		}
	}

}
