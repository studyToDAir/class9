package quiz.cafe;

import java.util.ArrayList;
import java.util.HashMap;

public class Cafe {

	/*
	 *  커피, 가게이름, 알바생, 디저트, MD상품, 디카페인
	 *  바닥에 기어다니는 개미, 기계에 붙어있는 개미, 손님
	 *  티tea, 빨대, 컵홀더, 가격
	 *  주문, 구매, 결제, 키오스크, 돈, 서빙
	 *  바코드, 커피만들기, 설거지
	 */
	// 필드
	/*
	 * 가격s+메뉴s
	 * 가게이름
	 * 비품s
	 * 건물 = null
	 * 직원s
	 */
	String building; 	// 건물명
	String name;		// 가게이름
	int emp;			// 직원 수
	private HashMap menuMap;	// 메뉴: 가격
	HashMap getMenuMap() {
		return this.menuMap;
	}
	void setMenuMap(HashMap menuMap){
		this.menuMap = menuMap;
	}
	void putMenu(String menu, int price) {
		this.menuMap.put(menu, price);
	}
	
	ArrayList list;		// 비품
	int money = -1;		// 받아야 하는 돈
	String menu;		// 주문 메뉴
	int count;			// 주문 개수
//	{
//		아아: 3000,
//		따아: 2500
//	}
//	
//	[
//	 {
//		menu: 아아,
//		price: 3000
//	},{
//		menu: 아아,
//		price: 3000
//	},{
//		menu: 아아,
//		price: 3000
//	}
//	]
	
	
	
	// 생성자 // 카페 차리기
	/*
	 * 건물명 설정, 
	 * 가게이름
	 * 직원몇명고용(추후 수정 가능), 
	 * 메뉴+가격 설정(추후 수정 가능),
	 */
	Cafe(String building, String name, int emp, HashMap menuMap){
		this.building = building;
		this.name = name;
		this.emp = emp;
		this.menuMap = menuMap;
	}
	Cafe(String building, String name){
//		HashMap m = new HashMap();
		this(building, name, 0, null);
	}
	
	// 메소드
	/*
	 * 주문받기, 결제하기, 커피만들기, 설거지, 일마감, 서빙, 메뉴 추가
	 */
	
	// 주문받기
	// 메뉴와 개수를 입력하면
	// 메뉴의 가격을 구하고
	// 		메뉴가 없으면 -1을 return
	//		메뉴가 있으면 개수를 곱해서 return
//	void order() {
	int order(String menu, int count) {
		System.out.println("주문 내역");
		System.out.println("menu : "+ menu);
		System.out.println("count : "+ count);
		
		int money = -1;
		/*
		  	{ "아아": 3000 }
		 */
		if( this.menuMap.get(menu) != null ) {
			money = (int)this.menuMap.get(menu) * count;
			this.menu = menu;
			this.count = count;
		}

		this.money = money;
		return money;
	}
	
	
	// 결제하기
	// 메소드명: pay
	// 전달인자: int money
	// 리턴타입: int 거스름돈
	int pay(int money) {
		if(this.money == -1) {
		// 주문 내역이 없는 상태
			return money;
		} else if( this.money <= money ) {
		// 받은 금액이 결제할 금액 이상
			return money - this.money;
//		} else if( this.money > money ){
		} else {
		// 받은 금액이 결제할 금액 미만
			return money;
		}
	}
	
	// 서빙
	// 메소드명: serve
	// 전달인자: 없음
	// 리턴타입: void
	void serve() {
		System.out.println("주문하신 "
	            + this.menu +", "
				+ this.count +"개 나왔습니다");
	}
	
	void make() {
		System.out.println("우리는 "+this.menu+" 만드는게 신난다!");
		// 랜덤으로 커피 결과물 선택
		// 잘만들어진, 조금탄, 연한
		serve();
	}
}
