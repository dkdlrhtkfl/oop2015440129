import java.util.Scanner;

public class Twenty_five {

	public static void main(String[] args) {
		int i=11, a=11, b=0;
		while(i>0)
		{
			while(a>0)
			{
				System.out.print("*");
				a--;
			}		
			a=i;
			
			while(a>1)
			{
				System.out.print(a/2);
				a=a-2;
			}		
			
			while(a<=i)
			{
				System.out.print(a/2);
				a=a+2;
			}				
			
			i=i-2;
			a=i;
			
			
			
			
			System.out.println();
		}
		
		
		
		i=3;
		a=2;
		while(i<=11)
		{
			while(b<=a)
			{
				System.out.print("*");
				b++;
			}
			
			
			while(a>1)
			{
				System.out.print(a/2);
				a=a-2;
			}			
			
			a=i;
			b=1;
			while(b<=a)
			{
				System.out.print(b/2);
				b=b+2;
			}	
			
			i=i+2;
			a=i;
			b=1;
						
			System.out.println();
		}
	}

}
