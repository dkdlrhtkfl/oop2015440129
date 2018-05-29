
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);
		Integer i; //int: primitive type, Integer: reference type
		i = 3;
		System.out.println(i);
		String str1 = "Mr." + box.get();
		System.out.println("the box contains " + str1);
		
		int a = 10;
		box.set(a);//auto boxing
		//System.out.println(10 + box.get());

	}
}