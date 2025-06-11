package sec04.exam06.overloading;

public class Calc {
	
//	String name;
//	String address;
//	void set(String name) {
//		
//	}
//	void set(String address) {
//		
//	}

	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a + b;
	}
	
//	// 전달인자가 int, int로 같기 때문에 오버로딩 적용 안됨
//	int plus(int a, int b) {
//		return a + b;
//	}
	
	double plus(double a, double b) {
		System.out.println("더블더블 실행");
		return a + b;
	}

	double plus(int a, double b) {
		System.out.println("int double 실행");
		return a + b;
	}

//	int plus(int b, int a) {
//		System.out.println("int int 실행");
//		return a + b;
//	}

	int plus(int x) {
//		return x + x;
		int result = plus(x, x);
		return result;
	}
	
	
	String model;
	String color;
	int year;
	
	void setInfo(String m, String c, int y) {
		model = m;
		color = c;
		year = y;
	}
	void setInfo(String m, String c) {
		
		setInfo(m, c, 2025);
		
	}
	void setInfo(String m) {
		
		setInfo(m, "검정", 2025);
		
	}
	
	
	Calc newCalc(){
		Calc c = new Calc();
		return c;
	}
	
	Calc[] newCalcArray(){
		Calc[] a = new Calc[10];
		return a;
	}
}
