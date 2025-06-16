package sec06.exam02.pack3;

//import sec06.exam02.pack2.Human;
////import sec06.exam02.pack1.Human; // 동일한 클래스명이라 안됨

import sec06.exam02.pack1.*;

public class HumanExam {

	public static void main(String[] args) {

//		new Human(); // pack2.Human
//		
////		Human h2 = new sec06.exam02.pack1.Human();
//		sec06.exam02.pack1.Human h2 = new sec06.exam02.pack1.Human();

		// import sec06.exam02.pack1.*;
		new Human(); 	// pack1.Human

		// 하위 패키지의 클래스라서 못가져옴
//		new Sub1();		// pack1.sub1.Sub1 
		
		// import java.lang.* 자동 선언 되어서 import 생략 가능
		String a = "1";
		System.out.println();
		Math.random();
	}

}
