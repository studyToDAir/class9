package quiz;

public class GoodsCoupangExam {

	public static void main(String[] args) {

		GoodsCoupang coupang = new GoodsCoupang();
		
		Goods g1 = new Goods();
		g1.urlImage = "http://g1";
		g1.name = "우유 2.3L";
		g1.price = 6480;
		coupang.insert(g1);
		
		Goods g2 = new Goods();
		g2.urlImage = "http://g2";
		g2.name = "두부 300g";
		g2.price = 1830;
		coupang.insert(g2);
		
		coupang.selectAll();
		System.out.println("-------------------");
		g2 = new Goods();	// 새로 만들지 않으면 원본을 변경하게 된다	
		g2.urlImage = "http://g3";
		g2.name = "이오 10개입";
		g2.price = 3730;
		coupang.insert(g2); // 얕은 복사
		
		coupang.selectAll();
		
		System.out.println("-------------------");
		coupang.addCartTable(1);
		coupang.addCartTable(1);
		coupang.selectCartTableAll();
		
		int total = coupang.cartTotalPrice();
		System.out.println("카트 총 금액 : "+ total);
	}

}
