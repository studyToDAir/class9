package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {

		int score = 75;
		
		if(score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
		}
		
		if(score < 90) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		if( !(score >= 90) ) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		
		
		if(score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
		} else {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		// else가 있다는 건 무조건 하나의 실행 블럭이 실행 된다
		
		
		if(score >= 90) {
			System.out.println("A 등급");
//		} else if( score < 90 && score >= 80 ) {
		} else if( score >= 80 ) {
			System.out.println("B 등급");
		} else if (score >= 70) {
			System.out.println("C 등급");
		} else {
			System.out.println("D 등급");
		}
		
		score = 97;
		if(score >= 95) {
			System.out.println("90점 이상");
			System.out.println("95점 이상");
		} else if(score >= 90) {
			System.out.println("90점 이상");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상");
			
//			if(score >= 90 && score >= 95) {
			if(score >= 95) {
				System.out.println("95점 이상");
			}
		}
		
		
		if(score >= 90) {
			System.out.println("90점 이상");
		}
//		위의 if와 관계 없이 무조건 판단한다
		if(score >= 95) {
			System.out.println("95점 이상");
		} 
		
		
		int x = 3;
		if( x%2 == 0){
			System.out.println("짝수");
//		} else if( x%2 != 0 ) {
//		} else if( x%2 == 1 ) {
		} else {
			System.out.println("홀수");
		}
		
		///////////////////////////
		// random
		double random1 = Math.random();
		System.out.println(random1);
		
		// Math.random()
		// 0 <= Math.random() < 1
		// 주사위 : 1~6
		// 대충 나머지로 구하는 법
		double random2 = Math.random() * 10000;
		int dice = ( (int)random2 ) % 6 + 1;
		System.out.println("주사위 : "+ dice);
	}

}
