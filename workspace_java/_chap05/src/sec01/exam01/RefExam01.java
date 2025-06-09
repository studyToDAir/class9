package sec01.exam01;

public class RefExam01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		System.out.println(a +", "+ b);
		
		b = 12;
		System.out.println(a +", "+ b);
		
		String c = "최민수";
		// = 을 기준으로 오른쪽이 먼저 실행된다
		// "최민수"를 힙heap 영역의 비어있는 번지에 할당(놓기)
		// 스택stack 영역의 변수 c에 방금 그 번지를 저장
		System.out.println("c : "+ c);
		
		System.out.println( a == b );
		// == 또는 != 는 무조건 stack의 값을 비교한다
		
		String d = new String("최민수");
		System.out.println( c == d );
		System.out.println( c.equals(d) );
		// String 값 비교는 무조건 equals()를 사용한다
		
		String e = d;
		System.out.println( e == d );	// 같음
		
		String f0 = "최민수";
		System.out.println("c == f0 : "+ (c == f0));
		String f = "최"+"민수";
		System.out.println("c == f : "+ (c == f));
		
//		a = null;
		// 기본 타입에는 null을 넣을 수 없다
		
		// null : 참조하는 주소가 없는 상태
		String g = "휴먼";
		System.out.println("g == null : "+ (g == null));
		System.out.println("g != null : "+ (g != null));
		
		String h = ""; // null이 아닙니다
		System.out.println("h != null : "+ (h != null));
		
		g = null;
		System.out.println("g == null : "+ (g == null));
		System.out.println("g + \"abc\": "+ (g+"abc"));
		
		System.out.println(  h.equals(g)  );
		if(g != null) { // 방어 코딩
			System.out.println(  g.equals(h)  );
		}
		
	}

}
