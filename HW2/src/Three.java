
public class Three {

	public static void main(String[] args) {
		int i = 1, a = 0;
		
		while(i<=100) {
			if(i%3 == 0)
				a = a + i;
			i++;
		}
		System.out.println(a); 

	}

}
