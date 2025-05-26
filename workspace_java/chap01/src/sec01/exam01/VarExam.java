package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {

		// 변수 선언
		int value;	
		// 변수에 값 넣기
		value = 5;
		value = 6;	// 덮어쓰기
		System.out.println(value);
		
		int result = value + 10;
		
		System.out.println(result);
		

		int hour = 3;
		int minute = 5;
		System.out.println( hour + "시간 " + minute +"분" );
		
		
		value = value + 1;
		System.out.println("value : "+ value);
		
		// 이클립스 단축키
		/*
		 * 한줄 지우기 : Ctrl + d
		 * 한줄 복사   : Ctrl + Alt + 위아래 방향키
		 * 주석 단축키 : Ctrl + /
		 * 한줄 이동   : Alt + 위아래 방향키
		 */
		
		// 변수 a를 선언과 동시에 10으로 초기화
		int a = 10;
		int b;	// 변수 선언
//		System.out.println(b);
		
//		System.out.println(x);
		int x = 10;
		int y = x;
//		int x = 10000;
		
		System.out.println(x);
		{
//			int x = 3;
			System.out.println(x);
			int z = 5;
			System.out.println("z : "+ z);
		}
		int z = 55;
		System.out.println("z : "+ z);
		
		
		int x1 = 26845;
		int x2 = 684684;
		/*
		 * 
		 */
		System.out.println("x1 : "+ x1); // 684684
		System.out.println("x2 : "+ x2); // 26845
	}

}
