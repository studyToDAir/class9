package sec01.exam01;

public class breakExam05 {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int count = 0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("주사위 : "+ num);
			
			if(num == 6) {
				break;
			}
			
			count++;
		}
		System.out.println("게임 종료 : 총 : "+ count);
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
			if(i >= 5) {	// 혹시 몰라서
				break;
			}
		}
		
		
		
		// 총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
			
			// 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; j++) {
				int num2 = (int)(Math.random()*6) + 1;
				System.out.println("주사위0 : "+ num2);
				
				// 만약 6이 나오면 게임 종료, 다음 사람으로 넘어감
				if(num2 == 6) {
					break;
				}
			}
		}
		
		// 한명이라도 6이 나오면 전체 게임 종료
		boolean isStop = false; // 그런 사건이 있었는지?
		// 총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
			
			// 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; j++) {
				int num2 = (int)(Math.random()*6) + 1;
				System.out.println("주사위1 : "+ num2);
				
				// 만약 6이 나오면 전체 게임 종료
				if(num2 == 6) {
					isStop = true;
					break;
				}
			}
			
			if(isStop) {
				break;
			}
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {	// 짝수 일 때만 출력하라
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {	// 홀수 일 때는 건너 뛰어라
				continue;
			}
			System.out.println(i);
		}
		
	}

}
