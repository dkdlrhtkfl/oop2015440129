
public class Loop {

	public static void main(String[] args) {
		//1~10 ������ ȭ�鿡 ���
		int i = 1; //1. �������� �ʱ�ȭ
	
		while(i<=10) { //2. ���� ���ǽ�
			System.out.println(i); //3. ������
			i++; //4. �������� ��ȭ
		}
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}

		
		//1���� 10���� ���ϱ�
		i=1; //1. �������� �ʱ�ȭ
		int sum=0;
		while(i<=10) { //2. ���� ���ǽ�
			sum=sum+i; //3. ������
			i++; //4. �������� ��ȭ
		}
		
		System.out.println("Sum = " + sum);

		for(i=1, sum=0; i<=10; i++) {
			sum=sum+i;
		}		
		System.out.println("Sum = " + sum);

		
		String str = "hello darkness my old friend";
		int count = 0;
		for(i=0; i < str.length(); i++) { //i�� ��Ʈ���� ���̿� ���� ũ�Ⱑ �ɶ�����
			if(str.charAt(i) != 'l') //��Ʈ���� i��° ��ġ�� l�� ������ �Ǵ�
				continue; //�ٸ��� �ٽ� ����
				
			count++;
		}
		System.out.println("���忡 �߰ߵ� l�� ������ " + count);

		
		System.out.println("=================���α׷� ����===================");

	}

}
