package sept2521.acessmodifier.am2;

import sept2521.acessmodifier.am1.TestM;
import sept2521.acessmodifier.am1.TestN;

public class TestY extends TestN {

	public static void main(String[] args) {
		callTestY();
	}

	public static void callTestY() {
		new TestN().methodPublic();
		new TestM().methodPublic();
		TestX testX = new TestX();
		System.out.println("intValueTestXPublic " + testX.methodPublic());
		System.out.println("longValueTestXDefault " + testX.longValueTestXDefault);
		System.out.println("floatValueTestXProtected " + testX.floatValueTestXProtected);
		System.out.println("charValueTestXPublic " + testX.charValueTestXPublic);
	}

}
