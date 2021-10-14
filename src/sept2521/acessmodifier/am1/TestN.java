package sept2521.acessmodifier.am1;

public class TestN {

	public int intValueTestNPublic = 45;
	protected long longValueTestNProtected = 4761228;
	double doubleValueTestNDefault = 3.78;

	public void methodPublic() {
		System.out.println("calling Class TestN - > methodPublic");
		methodPrivate();
		methodProtected();
		methodDefault();
	}

	private void methodPrivate() {
		System.out.println("calling Class TestN - > methodPrivate");
	}

	protected void methodProtected() {
		System.out.println("calling Class TestN - > methodProtected");
	}

	void methodDefault() {
		System.out.println("calling Class TestN - > methodDefault");
	}

}
