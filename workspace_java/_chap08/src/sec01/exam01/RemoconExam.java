package sec01.exam01;

public class RemoconExam {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setVolume(50);
		System.out.println(tv.vol);
		
//		new RemoteControl();
		RemoteControl rc1 = (RemoteControl)tv;
		RemoteControl rc2 = tv;
		powerOn(tv);
	}

	static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}
}
