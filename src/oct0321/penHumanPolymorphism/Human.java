package oct0321.penHumanPolymorphism;

public class Human extends Monkey implements Animal {


	@Override
	public String eat() {
		return "eat";
	}

	@Override
	public String sleep() {
		return "sleep";
	}
	
	public static void main(String[] args) {
		Monkey m;
		m = new Human(); 
		System.out.println("Human: " + m.jump());
		System.out.println("Human: " + m.bite());
	}


}
