package jjw2;

import jjw1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2;		// age is private field
		
		//다른 패키지의 클라스를 사용하려면 
		//1. 패키지명.클라스명
		//jjw1.Dog aDog = new jjw1.Dog(); 
		//2. import jjw1.* 을 사용 
		Dog aDog = new Dog();
		aDog.name = "happy";

		// aDog.nickName = "kk"; //nickName은 패키지 접근지정이므로 jjw1에서만 public으로 동작
		Animal aa = new Animal();
		
		Rosemary rr = new Rosemary();
		
	}

}
