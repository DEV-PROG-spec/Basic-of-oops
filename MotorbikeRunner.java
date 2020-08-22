package oops;

public class MotorBikeRunner {

	
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(50);
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());
		
		//ducati.setSpeed(100);
		//honda.setSpeed(20);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(250);
		System.out.println(ducati.getSpeed());
      
	}

}
