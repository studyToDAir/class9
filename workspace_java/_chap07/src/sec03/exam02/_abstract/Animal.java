package sec03.exam02._abstract;

public abstract class Animal {
	
	Animal(int maxAge){
		
	}

	String kind;
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상 메소드
	// abstract 키워드가 붙은 메소드
	// 실행 블럭{}이 있으면 안됨
	// 나는 구현하지 않고 자식에게 구현을 떠넘김
	abstract void sound();
	
	void love() { 
		
	}
}
