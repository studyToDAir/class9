package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {

		int x = 10;
		
		x++;
		System.out.println("x: "+ x);
		++x;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1;
		x += 1; // 위와 같은 코드
		x++;	// 위와 같은 코드
				// 단, 1을 증가할때만
		
		int y = 10;
		y--;
		--y;
		System.out.println("y: "+ y);
		
		x = 10;
		int z = ++x;
		System.out.println("z: "+ z);
		
		x = 10;
		z = x++;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		x = 10;
		System.out.println("++x : "+ ++x);
		x = 10;
		System.out.println("x++ : "+ x++);
		
		x = 1;
		//  1   +   3
		z = x++ + ++x;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		x = 1;
		// x = 1 >> 2 >> 1 >> 2 >> 1
		//  1   -   1 * 1   - 2
		//  1   -  (1 * 1)  - 2
		z = x++ - --x * x++ - x--;
		// x와 z의 값은?
		System.out.println("x: "+ x +", z: "+ z);
		System.out.printf("x: %d, z: %d", x, z);
		System.out.println();
		
		boolean a = false;
		a = !a;
		System.out.println("a : "+ a);
		
		// 나누기 할 때 0으로 나누지 않도록 조심
		int b = 10;
//		int c = b / 0;
		
		double d = 7.3;
		double e = d / 0;
		System.out.println(d); // Infinity
		
		boolean f = 3 > 4;
		
		System.out.println(0.1 == 0.1f); //false
		// 소수점을 비교할 때는 같은 타입으로 변환해서 비교하자
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2));
		// 글씨는 무조건 equals로 비교한다
		System.out.println(  "ssss".equals(s2)  );
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫 : "+ (c1 / c2));
		System.out.println("나머지 : "+ (c1 % c2));
		
		// 퀴즈
		// 난 돈이 10000원 있습니다
		// 1. 4500원짜리 프라프치노를 최대 몇 잔 살 수 있나요?
		// 2. 그리고 남은 돈
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println("총 "+ count +"잔");
		int change = money % coffee;
		System.out.println("잔액: "+ change);
		
		// 올리브영에 꿀홍차가 8000원인데 
		// 15% 세일중이면 꿀홍차 가격은?
		int honey = 8000;
		double m = honey - (honey * 0.15);
		// honey - (honey * 0.15)
		// (honey * 1) - (honey * 0.15)
		// honey * (1 - 0.15)
		// honey * 0.85
		
		// 957
		// 957 % 100
		// 957 % 10
		
		int score = 87;
		System.out.println("내 점수는 80과 90사이다 참? 거짓?");
		// true / false 출력
		System.out.println( score >= 80 && score <= 90 );
		
		// 어떤 숫자를 10의 자리 이하 버림
		// a - (a%100)
		int k = 1937;
		k = k - (k % 100);
		k = k / 100;
//		k /= 100;
		k = k * 100;
//		k *= 100;
		
		// v1 / v2를 소수점 3자리까지 출력하시오
		// 오칙연산으로만 해결하세요 plz..
		double v1 = 1000.0;
		double v2 = 794.0;
		
		double v3 = v1 / v2;
		v3 = ( (int) (v3 * 1000) ) / 1000.0;
		
		System.out.println(v3);
		
		double v4 = (v1 / v2) * 1000;
		int v5 = (int) v4;
		double v6 = (double)v5 / 1000;
		
		int s = 95;
		String grade = ( s > 90 ) ? "A" : "B";
		System.out.println("grade: "+ grade);
	}

}
