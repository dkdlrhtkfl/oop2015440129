import java.util.*;


public class AnimalSing {
	List<Animal> list; //Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	
	void add(Animal ele) {
		list.add(ele);
	}

	void sing() {
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			(e.next()).sing(); //Polymorphism
		}
	}
}
