package oct0321.oopsConcept.mnc;

public class Hello extends Infosys {

     void india() {
    	 System.out.println("Hello india");
     }
	
	 void us() {
		 System.out.println("Hello us");
	 }
	
		public void newMethod() {
			System.out.println("Hello newMethod");
			super.india();
		}
	
	public static void main(String[] args) {
		Hello h;
		h = new Hello();
		h.india();
		h.us();
		h.newMethod();
	}

}
