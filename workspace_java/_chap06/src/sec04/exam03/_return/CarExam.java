package sec04.exam03._return;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		boolean status = car.isLeftGas();
		System.out.println("가스 남았나? "+ status);
		
		car.gas = 3;
		car.setGas(3);
		
		status = car.isLeftGas();
		System.out.println("가스 남았나? "+ status);
		
		if( status ) {
//		if( car.isLeftGas() ) {
			System.out.println("출발~!");
			car.run();
		}
		
	}

}
