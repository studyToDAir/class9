package sec02.exam01.driver;

public class Driver {

	void driveTico(Tico tico) {
		System.out.println("Driver: 오직 티코만!!");
		tico.run();
		tico.autoRun();
	}
	
	void drive(Car car) {
		System.out.println("run 박습니다 손님");
		car.start();
		car.run();
		
		if( car instanceof Tico ) {
			System.out.println("어 이거 티코네요!");
			Tico tico = (Tico) car;
			tico.autoRun();

			((Tico) car).autoRun();
		}
		
		car.stop();
		
//		car.autoRun();
	}
}
