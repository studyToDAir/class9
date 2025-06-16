package quiz;

import java.util.ArrayList;

public class GoodsCoupang {

	ArrayList goodsTable = new ArrayList();
	ArrayList cartTable = new ArrayList();
	
	// 굳즈를 추가
	// 메소드명 : insert
	// 전달인자 : Goods
	// 리턴타입 : 없음
	void insert(Goods goods) {
		goodsTable.add(goods);
	}
	
	// 굳즈 모두 출력
	void selectAll() {
		for(int i=0; i<goodsTable.size(); i++) {
			Goods goods = (Goods)goodsTable.get(i);
			System.out.println(i+"번째 상품------");
			System.out.println(goods.urlImage);
			System.out.println(goods.name);
			System.out.println(goods.price);
		}
	}
	// 굳즈 하나 추출
	// 메소드명 : selectOne
	// 전달인자 : int index
	// 리턴타입 : Goods // 선택된 굳즈 돌려주기
	Goods selectOne(int index) {
		return (Goods)goodsTable.get(index);
	}
	
	// 카트에 굳즈 추가
	// 메소드명 : addCartTable
	// 전달인자 : int index
	// 리턴타입 : void
	void addCartTable(int index) {
		
		Goods goods = selectOne(index);
		this.cartTable.add(goods);
		
	}
	
	// 카트 모두 출력
	void selectCartTableAll() {
		for(int i=0; i<cartTable.size(); i++) {
			Goods goods = (Goods)cartTable.get(i);
			System.out.println(i+"번째 상품------");
			System.out.println(goods.urlImage);
			System.out.println(goods.name);
			System.out.println(goods.price);
		}
	}
	
	int cartTotalPrice() {
		int total = 0;
		for(int i=0; i<cartTable.size(); i++) {
			Goods goods = (Goods)cartTable.get(i);
			total += goods.price;
		}
		return total;
	}
}










