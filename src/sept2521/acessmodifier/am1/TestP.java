package sept2521.acessmodifier.am1;

public class TestP {
	public static void main(String args[]) {
		TestM testM = new TestM();
		System.out.println("intValueTestMPublic " + testM.intValueTestMPublic);
		System.out.println("floatValueTestMProtected " + testM.floatValueTestMProtected);
		System.out.println("longValueTestMDefault " + testM.longValueTestMDefault);

		TestN testN = new TestN();
		System.out.println("intValueTestNPublic " + testN.intValueTestNPublic);
		System.out.println("longValueTestNProtected " + testN.longValueTestNProtected);
		System.out.println("doubleValueTestNDefault " + testN.doubleValueTestNDefault);
	}

	public void methodPublic() {
		System.out.println("calling Class TestP - > methodPublic");
		methodPrivate();
		methodProtected();
		methodDefault();
	}

	private void methodPrivate() {
		System.out.println("calling Class TestP - > methodPrivate");
	}

	protected void methodProtected() {
		System.out.println("calling Class TestP - > methodProtected");
	}

	void methodDefault() {
		System.out.println("calling Class TestP - > methodDefault");
	}

}
