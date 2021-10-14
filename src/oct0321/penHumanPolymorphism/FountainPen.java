package oct0321.penHumanPolymorphism;

public class FountainPen extends Pen {

	public static String nib() {
		return "nib";
	}

	@Override
	public String write() {
		return "write";

	}

	@Override
	public String refill() {
		return "refill";
	}

	public static void main(String[] args) {
		Pen m;
		m = new FountainPen(); 
		System.out.println("FountainPen: " + m.write());
		System.out.println("FountainPen: " + m.refill());
		System.out.println("FountainPen: " + nib());
	}


}
