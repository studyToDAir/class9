package sec05.exam02._static;

import java.util.Scanner;

public class Calc {

	String color;
	// static이긴 하지만 그래 봤자 필드다
	static double pi = 3.14;
//	static int a = 10;
	int a = 10;
//	static int price = a;
	
	static int price;
//	price = 100;
	static {
		price = 100;

		System.out.println("값을 입력 하시요");
//		Scanner s = new Scanner(System.in);
//		price = s.nextInt();
	}
	
	Calc(){
		price = 10000;
	}
}
