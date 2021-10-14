package oct0321.oopsConcept.vehicle;

public class EightWheeler extends Vehicle {
	int speed = 70;
	long distance = 90;
	int nos_of_tyre = 8;

	public void run() {
		System.out.println("EightWheeler run()");
	}

	public void stop() {
		System.out.println("EightWheeler stop()");
	}

	EightWheeler() {
		System.out.println("EightWheeler default constructor");
	}

	void display() {
		System.out.println("EightWheeler speed : " + speed + ", EightWheeler distance : " + distance
				+ ", EightWheeler nos_of_tyre : " + nos_of_tyre);
		System.out.println("Vehicle speed : " + super.speed + ", Vehicle distance : " + super.distance);
		run();
		stop();
	}
}
