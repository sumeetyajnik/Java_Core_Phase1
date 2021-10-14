package oct0321.oopsConcept.vehicle;

public class TwoWheeler extends Vehicle {
	int speed = 40;
	long distance = 60;
	int nos_of_tyre = 2;

	public void run() {
		System.out.println("TwoWheeler run()");
	}

	public void stop() {
		System.out.println("TwoWheeler stop()");
	}

	TwoWheeler() {
		System.out.println("TwoWheeler default constructor");
	}

	void display() {
		System.out.println("TwoWheeler speed : " + speed + ", TwoWheeler distance : " + distance
				+ ", TwoWheeler nos_of_tyre : " + nos_of_tyre);
		System.out.println("Vehicle speed : " + super.speed + ", Vehicle distance : " + super.distance);
		run();
		stop();
	}

}
