package sept2621.methodOverLoad;

public class MethodOverload {

	public void calculate(int a, int b) {
		System.out.println("Add 2 numbers : " + (a + b));
	}

	public void calculate(float f) {
		System.out.println("Area of Circle : " + (3.14 * f * f));
	}

	public void calculate(int l, float b) {
		System.out.println("Area of Rectangle : " + (l * b));
	}

	public void calculate(int l, int b, int h) {
		System.out.println("Area of Triangle : " + (l * b * h));
	}
	
	public void calculate(double l, double b) {
	  System.out.println("Area of Rhombus : " + (l*b)/2 );
	}

	public static void main(String[] args) {
		MethodOverload methodOverload = new MethodOverload();
		methodOverload.calculate(4, 8);
		methodOverload.calculate(2.678f);
		methodOverload.calculate(7, 5.87f);
		methodOverload.calculate(3.5, 4.1);
	}

}
