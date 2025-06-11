package sec04.exam06.overloading;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.plus(1, 2);
		calc.plus(1.5, 2.7);
		
		System.out.println("문자");
		System.out.println(1);
		
		calc.plus(1, 2.7);
		
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();
		Calc c4 = new Calc();
		Calc c5 = new Calc();
		
		c1.setInfo("모델a", "검정", 2025);
		c2.setInfo("모델b", "파랑", 2025);
		c3.setInfo("모델c", "빨강");
		c4.setInfo("모델d");
		
		
		Integer i = 3;
		if( i != null ) {
			int i2 = i;
		}
		Integer i3 = null;
		
		
		Calc d = calc.newCalc();
	}

}
