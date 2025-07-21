package sec03.exam02._abstract;

public abstract class Windows {

	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("윈도우 실행");
		start();
		System.out.println("마우스 커서는 로딩중...");
	}
	
	abstract void start();
//	abstract final void start();
//	private abstract void start();

//	abstract void desktop();
	void desktop() {
		
	}
	
	
}
