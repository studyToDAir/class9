package sec01.exam03.override;

public class Computer extends Calc {
	
	@Override // 부모에 해당 메소드가 똑같이 선언돼 있는지 검사해줌 
	public double areaCircle(double r) {
		System.out.println("Computer의 areaCircle");
		return r * r * Math.PI;
	}

	@Override
	public int plus(int x, int y) {
		int result = super.plus(x, y);
		
		System.out.println("Computer의 plus 실행");
		System.out.println("정답은 바로 "+ result +"입니다");
		return result;
	}
}
