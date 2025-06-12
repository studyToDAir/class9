package sec03.exam01.constuctor;

public class Car {

//	Car(){
//		System.out.println("Car 생성자 실행");
//	}

//	// 생성자를 생략한 경우(생성자가 하나도 없는 경우)
//	// 기본 생성자가 자동 완성 된다
//	Car(){
//		// 기본 생성자
//	}
//	// 생성자가 하나라도 선언되어 있으면
//	// 기본 생성자는 만들어지지 않는다


	Car(){
		// 보통 생성자는 필드 값 초기화 하는데 많이 사용된다
		color = "빨강";
//		if
//		for
//		test();
	}
	
	String model = "아반떼";
	String color;
	int maxSpeed;
	CarExam carExam = new CarExam();
	
//	Car(String c){
//		color = c;
//	}
	
	Car(String c){
//		int a = 19;
		// 다른 생성자를 호출하는 방법
		// 무조건 첫번째 줄에서 호출해야 한다
		this("아반떼", c, 240);

		color = c;
		model = "아반떼";
		maxSpeed = 240;
	}
	
	Car(String m, String c, int ms){
		model = m;
		color = c;
		maxSpeed = ms;
	}
	
	
	void test() {
		
	}
	
//	void setColor(String c) {
//		color = c;
//	}
	
//	void setColor() {
//		String color;
//		color = "빨강";
//	}
	void setColor(String color) {
//		this.color = "빨강";
		this.color = color;
//		this.test();
	}
	
}
