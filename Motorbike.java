package oops;

public class MotorBike {
	int speed;
	
	
	
	/**
	 * @param speed
	 */
	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}
	public void setSpeed(int s) {
		if (s>0) {
			this.speed = s;
		
		}
	}
	public int getSpeed() {
		return this.speed;
	}
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed+howMuch);
		
	}
	public void decreaseSpeed(int howMuch) {
	
		setSpeed(this.speed-howMuch);
		
	}


}
