package quiz;

public class FruitMarketExam {

	public static void main(String[] args) {

		FruitMarket market = new FruitMarket("휴먼과일", "천안");

		int price = market.ask2("토마토");
		System.out.println("토마토 가격은? " + price);

		Fruit fruit = new Fruit();
		fruit.name = "파인애플";
		fruit.price = 3000;
		fruit.stock = 15;

		market.addFruit(fruit);
		price = market.ask2("파인애플");
		System.out.println("파인애플 가격은? " + price);
	}

}
