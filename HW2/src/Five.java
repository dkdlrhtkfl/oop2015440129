
public class Five {

	public static void main(String[] args) {
		int i = 1, a = 0;
		
		
		do {
			if(i%3 == 0)
				a = a + i;
			i++;
		}
		while(i<=100);
		
		System.out.println(a); 
	}

}
