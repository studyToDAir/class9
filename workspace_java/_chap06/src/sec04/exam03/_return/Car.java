package sec04.exam03._return;

public class Car {

	int gas;
	
	void setGas(int g) {
		gas = g;
	}
	
	// 만약 주석을 단다면?
	// gas가 0이면 false, 그렇지 않으면 true를 돌려주는 메소드
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
			// return 하는 순간에 메소드 종료!
		} else {
			// else 가 있다는건 무건건 하나는 실행되는 것을 보장!
			System.out.println("gas가 있습니다");
			return true;
		}
		
//		System.out.println("gas가 있습니다");
//		return true;
	}
	
	// return을 한번만 하는 방식
	boolean isLeftGas2() {
		boolean result = false;
		
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			result = false;
		} else {
			System.out.println("gas가 있습니다");
			result = true;
		}
		
		return result;
	}
	
	boolean isLeftGas3() {
		return gas != 0;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다! 잔량:"+ gas);
				gas--;
			} else {
				System.out.println("멈춰! 잔량:"+ gas);
				return;
			}
		}
	}
}








