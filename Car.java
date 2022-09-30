package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("Car running successful");
	}
	public void applyBrake() {
		System.out.println("Car stopped");
	}

	public void soundHorn() {
		System.out.println("Horn sound");
	}
	
	public void isPuncture() {
		System.out.println("Checking tyre status");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		car.isPuncture();
	}
}
