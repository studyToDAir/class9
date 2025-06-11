package sec04.exam03._return;

public class Calc {
	// 메소드 안에서 메소드 호출하기

	// 두 수를 입력 받아 더한 결과를 돌려주는 메소드 plus
	int plus(int a, int b) {
		return a + b;
	}
	
	double avg(int x, int y) {
//		"값만 존재할 수 없는데";
//		plus(x, y);
		
		int sum = plus(x, y);
		double result = (double)sum / 2;
		return result;
	}

	void execute(int a1, int a2) {
		double result = avg(a1, a2);
		System.out.println(a1 +"과 "+ a2 +"의 평균은 "+ result);
	}
	
}
