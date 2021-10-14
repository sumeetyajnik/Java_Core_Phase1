package oct0321.oopsConcept.vehicle;

public class FourWheeler  extends Vehicle {

	int speed = 60;
	long distance = 80;
	int nos_of_tyre = 4;

	public void run() {
		System.out.println("FourWheeler run()");
	}

	public void stop() {
		System.out.println("FourWheeler stop()");
	}

	FourWheeler() {
		System.out.println("FourWheeler default constructor");
	}

	void display() {
		System.out.println("FourWheeler speed : " + speed + ", FourWheeler distance : " + distance
				+ ", FourWheeler nos_of_tyre : " + nos_of_tyre);
		System.out.println("Vehicle speed : " + super.speed + ", Vehicle distance : " + super.distance);
		run();
		stop();
	}
}
