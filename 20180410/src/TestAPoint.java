
public class TestAPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);

		System.out.println(pnt1); //�ּҰ� ��ſ� toString()�̶�� �̸��� �Լ��� �˾Ƽ� �ҷ���
		System.out.println(pnt2.distance());
		
//		System.out.println("(" + pnt.getX() + ", " + pnt.getY() + ")");
		
		System.out.println(pnt1.distance(pnt2));
	}

}
