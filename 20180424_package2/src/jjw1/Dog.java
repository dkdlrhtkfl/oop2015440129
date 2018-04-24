package jjw1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName; //package 접근지정: 같은 패키지 내에서만 public으로 동작
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
}
