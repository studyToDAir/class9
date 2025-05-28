package sec01.exam01;

public class VarTypeExam02 {

	public static void main(String[] args) {

		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
//		b1 = 128;
		
		char c1 = 65;
		System.out.println("c1: "+ c1);
		c1 = 65 + 2;
		System.out.println("c1: "+ c1);
		
		char c2 = 'F';
		System.out.println("c2: "+ c2);
		System.out.println("c1-c2: "+ (c2-c1));
		
		char c3 = '한';
		System.out.println("c3: "+ c3);
		System.out.println("c3: "+ (c3+1));
		
		String s1 = "최민수";
		System.out.println("s1: "+ s1);
		
		String s2 = "최\"민수";
		System.out.println("s2: "+ s2);
		
		String s3 = "최\t민\n수";
		System.out.println("s3: "+ s3);
		
		s3 = s3 + "글씨" + 3 + 2 + (3 + 2);
		System.out.println(s3);
		
		String s4 = 3+2+"글씨";
		System.out.println(s4);
		
		String s5 = s3 + s4;
		System.out.println("s5: "+ s5);
		
		int i1 = 2100000000;
//		int i2 = 2200000000;
		
		// L또는 l 을 붙이면 명시적인 long
		// 안붙이면 무조건 int로 생각한다
		long l1 = 2200000000L;
		long l2 = 123;
		
		float f1 = 3.14f;
		System.out.println("f1: "+ f1);
		double d1 = 3.14;
		System.out.println("d1: "+ d1);
		
		float f2 = 0.1234567890123f;
		System.out.println("f2: "+ f2);
		// float의 정밀도 : 소수점 7자리
		
		double d2 = 0.12345678901234567890;
		System.out.println("d2: "+ d2);
		// double의 정밀도 : 소수점 16자리
		
		double i10 = 5e2;
		
		boolean stop = true;
		boolean start = false;
		System.out.println(stop);
		
		// 퀴즈 0
		/*
		 * 두 변수 a, b에 각각 3, 4를 넣고
		 * 출력결과 : "3과 4". 
		 * 단, 변수를 활용해서
		 */
		int a = 3;
		int b = 4;
		System.out.println(a + "과 "+ b);
		
		// 퀴즈 1
		/*
		 * 1-1 : 두 변수 a, b에 각각 3, 4를 넣고
		 * 출력 결과 : "3 > 4의 결과는 false입니다"
		 * 1-2 : 두 변수의 값을 6,5 변경
		 * 출력 결과 : "6 > 5의 결과는 true입니다"
		 */
//		int x = 3;
//		int y = 4;
		int x = 6;
		int y = 5;
		System.out.println(x +" > "+ y + " 결과는 "+ (x > y) +"입니다");
		
		// 퀴즈 2
		/*
		 * 숫자 537
		 * 출력 결과
		 * "백의 자리 : 5"
		 * "십의 자리 : 3"
		 * "일의 자리 : 7"
		 */
		int num = 987;
		int bak = num / 100;
		System.out.println("백의 자리 : "+ bak);
		num = num - (bak * 100);
		System.out.println("num : "+ num);
		int ship = num / 10;
		System.out.println("십의 자리 : "+ ship);
		num = num - (ship * 10);
		System.out.println("num : "+ num);
		System.out.println("일의 자리 : "+ num);
		
	}

}
