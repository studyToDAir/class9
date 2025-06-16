package sec05.exam02._static;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.*;

public class CalcExam {
	
	int a = 10;

	public static void main(String[] args) {
		
//		System.out.println(a);
//		System.out.println(this.a);

		System.out.println("Calc.pi : "+ Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "블랙";
		c1.pi = 3.141592;
		System.out.println("c1.pi : "+ c1.pi);
		
		Calc c2 = new Calc();
		c2.color = "빨강";
		System.out.println("c2.pi : "+ c2.pi);
		
		System.out.println("Calc.pi : "+ Calc.pi);
		
		System.out.println( Math.PI );
		
		// 2. test 메소드 사용하기
//		test(); // static이 아니라서 사용 못함
//		CalcExam ce = new CalcExam();
//		ce.test();
		
		test();
		
//		java.util.ArrayList list = new java.util.ArrayList();
//		ArrayList list = new ArrayList();
		ArrayList list = new ArrayList();
		HashMap map = new HashMap();
	}
	
	// 1. 메소드명 test 만들기
	// 전달인자/리턴타입 없음
	// 그냥 아무 말이나 출력
//	void test() {
	static void test() {
		System.out.println("아무말");
	}

}
