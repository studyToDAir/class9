package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {
		
		System.gc();

		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char c = 'a';
//		char c = s1.charAt(100); // 범위 예외
		char c = s1.charAt(0);
		System.out.println("char c : "+ c);
		
		int i1 = s1.indexOf("삼사");
		System.out.println("i1 : "+ i1);
		
		int i2 = s1.lastIndexOf("삼사");
		System.out.println("i2 : "+ i2);
		
		int i3 = s1.indexOf("a");
		System.out.println("i3 없을 때: "+ i3);
		
		// 이메일 양식 점검
		// @와 .이 하나 이상 있는가?
		String email = "todair@naver.com";
		if( email.indexOf("@") != -1
				&& email.indexOf(".") >= 0 ) {
			System.out.println("이메일 맞음");
		} else {
			System.out.println("이메일 아님");
		}
		
		int idx = -1;
		// indexOf 구현
		// email에 첫 @가 어느 index에 있는지
		for(int i=0; i<email.length(); i++) {
			char temp = email.charAt(i);
			if(email.charAt(i) == '@') {
				idx = i;
				break;
			}
		}
		System.out.println("idx: "+ idx);
		
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1: "+ s1);
		System.out.println("s2: "+ s2);
		// replace는 모두 바꿔준다
		
		String s3 = s1.substring(5, 8);
		System.out.println("s3: "+ s3);
		
		// 주민번호로 남자인지 여자인지 출력
		String ssn = "123456-1234567";
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String s4 = ssn.substring(start, end);
		if(s4.equals("1") || s4.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 문제1
		// blog.naver.co.kr에서 naver만 추출하기
		
		// 문제2 응원 전광판
		// "Hello world "
		// "ello world H"
		// "llo world He"
		
		// 문제3 마스킹
		// humanec@naver.com 이걸
		// hu*****@naver.com 이케이케
		// love@naver.com 이것도
		// lo**@naver.com 이케이케
		
		// 문제4 검색어 찾기
		// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=1234&ackey=1oiioasi        
		// 키 query의 값이 검색어
		// 검색어만 출력
		
		String s5 = "  글씨   중간공백    ";
		System.out.println("["+ s5 +"]");
		System.out.println("["+ s5.trim() +"]");
		
		String menu = "김밥,라면,돈까스,제육덮밥";
		String[] menus = menu.split(",");
		for(String m : menus) {
			System.out.println(m);
		}
		
		String url = "blog.naver.com";
		// split 정규 표현식을 사용(String 아님에 주의)
		// .은 정규 표현식에서 사용하는 의미있는 예약어라서 
		// 문자.으로 인식하지 않는다
//		String[] urls = url.split(".");
//		String[] urls = url.split("\\."); // .을 표현하는 방법 1
		String[] urls = url.split("[.]"); // .을 표현하는 방법 2
		System.out.println( urls.length );
		
		String a = "a";
		a += "b";
		a = a + "c";
		
		// StringBuffer
		// 메모리를 효율적으로 사용한다
		// StringBuilder 보다 쪼끔느리다
		// 스레드에 안전하다(Thread-safe)
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		String d = sb.toString();

		// 쓰레드에 안전하지 않다
		StringBuilder sbb = new StringBuilder("a");
		sbb.append("b");
		String d2 = sbb.toString();
		
		long e = 3000000000L;
		float f = 2.5f;
	}

}
