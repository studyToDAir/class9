package quiz.cafe;

import java.util.HashMap;

public class Starbucks extends Cafe {

	Starbucks(){
		super("백자빌딩", "스벅 천안역점");
		
		HashMap map = new HashMap();
		
		map.put("아아", 4500);
		map.put("따아", 4000);
		setMenuMap(map);
	}
	
	@Override
	void make() {
		System.out.println("우리는 "+this.menu+" 만드는게 그닥 신나진 않는다");
		// 랜덤으로 커피 결과물 선택
		// 잘만들어진, 조금탄, 연한
		serve();
	}
	
}
