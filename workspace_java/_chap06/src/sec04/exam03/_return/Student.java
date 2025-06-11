package sec04.exam03._return;

public class Student {

	String name;
	int age;
	
	// 이름값을 전달 받아서 필드에 저장하는 메소드
	// 메소드명: setName
	// 전달인자: String
	// 리턴타입: void
	void setName(String n) {
		name = n;
		return;
	}
	
	// 이름 필드의 값을 돌려주는 메소드
	// 메소드명: getName
	// 전달인자: 없음
	// 리턴타입: String
	String getName() {
		return name;
	}
	
	
	// 이름과 나이를 받아서 저장
	// 메소드명: setInfo
	// 전달인자: String n, int a
	// 리턴타입: void
	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
	
//	String[] getInfo() {
	String getInfo() {
//		return name;
//		return age;

//		String[] a = {name, ""+age};
//		return a;
		
		
		return name + ","+age;
	}

}
