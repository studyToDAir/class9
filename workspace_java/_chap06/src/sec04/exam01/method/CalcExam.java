package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.powerOn();
		
		int sum = calc.plus(5, 7);
		System.out.println("sum:"+ sum);
		
		int x = 5;
		sum = calc.plus(x, 7);
		System.out.println("sum:"+ sum);
		
		int a = 5;
		sum = calc.plus(a, 7);
		System.out.println("sum:"+ sum);
		
		double b = calc.divide(10, 0);
		System.out.println("나누기 : "+ b);
		
		int[] c = {1,2,3,4,5};
//		int[] c = null;
		int sum2 = calc.sum(c);
		System.out.println("sum2: "+ sum2);
		System.out.println("c[0]:"+ c[0]);
		
		calc.sum2(1,2,3,4,5);
	}

}
