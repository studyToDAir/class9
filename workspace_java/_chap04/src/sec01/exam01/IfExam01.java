package sec01.exam01;

public class IfExam01 {

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
		// 0~5로 구해놓고 +1을 해서 1~6까지로 만들겠다
		
		// 대충 나머지로 구하는 법
		// Math.random() : 0.123456789
		double random2 = Math.random() * 10000;
		// 1234.56789
		// (int)1234.56789 >>> 1234
		// 1234 % 6 : 0 ~ 5
		// 0 ~ 5 +1 >>> 1 ~ 6
		int dice = ( (int)random2 ) % 6 + 1;
		System.out.println("주사위 : "+ dice);
		
		// 3 + 2 = 5
		// 3 + 2 +10 = 5 +10
		// 0*10 < 5*10 < 10*10
		// 0 <= Math.random() < 1
		// 0*6 <= Math.random()*6 < 1*6
		// 0 <= Math.random()*6 < 6	// 0 ~ 5.999999999999
		int dice0 = (int)(Math.random()*6);	// 0 ~5
		dice = dice0 + 1; // 1 ~ 6
		System.out.println("주사위 : "+ dice);
		
		// 로또 번호 : 1~45 >>> 0~44 +1
		int lotto1 = (int)(Math.random()*45) + 1; // 1~45
		System.out.println("lotto1: "+ lotto1);
		
		
		int num = 1;
		if( num == 1 ) {
			System.out.println("num은 1입니다");
		} else if( num == 2 ) {
			System.out.println("num은 2입니다");
		} else {
			System.out.println("num은 1과 2가 아닙니다");
		}
		
		// 사용가능 : char, byte, short, int, String
		// 사용못함 : boolean, long, float, double
		switch(num) {
			case 1 : 
				System.out.println("switch num은 1입니다");
//				break;
			case 2 :
				System.out.println("switch num은 2입니다");
				break;
			default :
				System.out.println("switch num은 1과 2가 아닙니다");
				break;
		}
		
		// 퀴즈
		// 월에 따라 계절을 출력하세요
		// 봄:3,4,5  여름:6,7,8  가을:9,10,11  겨울:12,1,2
		int month = 1;
		if(month == 1) {
			System.out.println("겨울");
		} else if(month == 2) {
			System.out.println("겨울");
		}
		
		if( 3 <= month && month <= 5 ) {
			System.out.println("봄");
		} if( 6 <= month && month <= 8 ) {
			System.out.println("여름");
		} if( 9 <= month && month <= 11 ) {
			System.out.println("가을");
//		} if( month == 12 || month == 1 || month == 2 ) {
//		} if( month == 12 || (month >= 1 && month <= 2) ) {
		} else {
			System.out.println("겨울");
		}
	
		switch(month) {
			case 3: 
			case 4: 
			case 5: 
				System.out.println("봄");
				break;

			case 6: 
			case 7: 
			case 8:
				System.out.println("여름");
				break;
 		}
	
		int i = 10;
		if(i > 5) {
			System.out.println("5보다 크다");
		}
		
		if(i > 5)
			System.out.println("5보다 크다");

		if(i < 0) i = 0;
		
		if(i > 50)
			System.out.println("50보다 크다");
			System.out.println("양수");
		
		if(i>0)
			if(i>5)
					System.out.println("5보다 크다");
			else
				System.out.println("5보다 작다");
		else
			System.out.println("음수");

		int studyBoss = ((int) (Math.random()*10) ) + 1;
		System.out.println("스터디 보스 : "+ studyBoss);
		
		i = i + 2;
		i += 1;
		i++;
	}

}
