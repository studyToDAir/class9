package quiz.cafe;

public class ArbeitExam {

	public static void main(String[] args) {

		Starbucks star = new Starbucks();
		
		Arbeit a1 = new Arbeit(star);
		a1.work("아아", 2);
		a1.pay(10000);
	}

}
