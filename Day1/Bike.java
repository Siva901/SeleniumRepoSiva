package week1.Day1;

public class Bike {
	
	public void driveBike() {
		System.out.println("Drive Bike");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	
	public void isPuncture() {
		System.out.println("is Puncture");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		bike.driveBike();
		bike.applyBrake();
		bike.soundHorn();
		bike.isPuncture();
	}

}
