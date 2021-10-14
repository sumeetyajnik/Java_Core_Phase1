package oct0321.oopsConcept.vehicle;

public abstract class Vehicle {
	
	int speed = 10;
	long distance = 30;
	
	abstract void run(); 
	
	abstract void stop(); 
	
	public void fuel(int a) {
		System.out.println("fuel int a : " + a);
	}
	
	public void fuel(float a, String b) {
		System.out.println("fuel float a : " + a + ", String b : " + b);
	}
	
	public void fuel(char a, int b) {
		System.out.println("fuel char a : " + a + ", int b : " + b);
	}
	
	
	public Vehicle(int s, long d) {
		speed = s;
		distance = d;
	}
	
	Vehicle()
	{
		System.out.println("Vehicle default constructor");
	} 
	void display() {
		
	}
	
	public static void main(String args[]) {

	Vehicle b; 
		
	b = new TwoWheeler();
	b.display();

	b = new ThreeWheeler();
	b.display();
	
	b = new FourWheeler();
	b.display();
	
	b = new EightWheeler();
	b.display();
	
	b.fuel(2);
	b.fuel(5.67f, "full");
	b.fuel('A', 78);
	}

}
