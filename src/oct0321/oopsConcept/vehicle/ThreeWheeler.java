package oct0321.oopsConcept.vehicle;

public class ThreeWheeler extends Vehicle {
	
	int speed = 50;
	long distance = 70;
	int nos_of_tyre = 3;

	public void run() {
		System.out.println("ThreeWheeler run()");
	}

	public void stop() {
		System.out.println("ThreeWheeler stop()");
	}

	ThreeWheeler() {
		System.out.println("ThreeWheeler default constructor");
	}

	void display() {
		System.out.println("ThreeWheeler speed : " + speed + ", ThreeWheeler distance : " + distance
				+ ", ThreeWheeler nos_of_tyre : " + nos_of_tyre);
		System.out.println("Vehicle speed : " + super.speed + ", Vehicle distance : " + super.distance);
		run();
		stop();
	}
	
}
