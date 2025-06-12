package quiz;

public class Dict {

	String[] en = {"love", "hate", "devil", "angel"};
	String[] ko = {"사랑",  "증오", "악마" , "천사"};
	
	// 영어를 한국어로 번역하는 메소드
	// 메소드명 : en2ko
	// 전달인자 : String 영단어
	// 리턴타입 : String 한국어
	String en2ko(String word) {
		for(int i=0; i<en.length; i++) {
//			if( word != null && word.equals(en[i]) ) {
			if( en[i].equals(word) ) {
				System.out.println("같은거 찾음 : "+ i);
				return ko[i];
			}
		}
		return "없는 단어";
	}
}
