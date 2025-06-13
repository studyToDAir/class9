package quiz;

public class FruitMarket {

	// 필드
	// 필드는 변수고, 변수는 뭔가를 저장할 수 있죠
	String name; 	// 업체명
	String address; // 업체주소

//	Fruit apple1 = new Fruit();
//	Fruit tomato1 = new Fruit();
	
//	int[] arr = new int[10]; // 참고
	Fruit[] fruits = new Fruit[10];
	
	// 생성자
	// new 하자마자 실행되는 메소드의 일종
	FruitMarket(String name, String address){
		System.out.println(fruits[0]);
		
		this.name = name;
		this.address = address;
		
//		apple1.name = "사과";
//		apple1.price = 1000;
//		apple1.stock = 5;
//		
//		tomato1.name = "토마토";
//		tomato1.price = 2000;
//		tomato1.stock = 10;
		init();
	}
	
	void init() {
//		apple1.name = "사과";
//		apple1.price = 1000;
//		apple1.stock = 5;
//		
//		tomato1.name = "토마토";
//		tomato1.price = 2000;
//		tomato1.stock = 10;
		
		fruits[0] = new Fruit();
		fruits[0].name = "사과";
		fruits[0].price = 1000;
		fruits[0].stock = 5;

		fruits[1] = new Fruit();
		fruits[1].name = "토마토";
		fruits[1].price = 2000;
		fruits[1].stock = 10;

	}
	
	FruitMarket(String address){
//		this.name = "오픈예정";
//		this.address = address;
		this("오픈예정", address);
	}
	
	// 메소드
	// 동작, 작동

	String _tomato = "토마토";
	int _tomatoPrice = 2000;
	
	String apple = "사과";
	int applePrice = 1000;


	
	// 과일 목록 전체 출력
	// 메소드 명 : print
	// 전달인자  : 없음
	// 리턴타입  : void
	void print() {
//		System.out.println("사과"+", 1000원");
		System.out.println(apple +", "+ applePrice +"원");
		System.out.println("수박");
		System.out.println("자두");
		
		System.out.println(this._tomato+", "+ _tomatoPrice+"원");
	}
	
	// 과일 가격 문의
	// 메소드명 : ask
	// 전달인자 : 과일명
	// 리턴타입 : 가격
	int ask(String fruitName) {
		if(this.apple.equals(fruitName)) {
			return applePrice;

		} else if(this._tomato.equals(fruitName)) {
//			return 2000;
			return _tomatoPrice;
		} else if(this._tomato.equals(fruitName)) {
//			return 2000;
			return _tomatoPrice;
			
		} else {
			System.out.println("그런 과일 없습니다");
			return -1;
		}
	}
	
	int ask2(String fruitName) {
		// 전체 과일 중에서
		for(int i=0; i<fruits.length; i++) {
			
			// 전달받은 이름과 같은게 있다면
			if(this.fruits[i].name.equals(fruitName)) {
				
				// 가격을 돌려줘라
				return this.fruits[i].price;
			}
		}
		
		System.out.println("그런 과일 없습니다");
		return -1;
	}
}
