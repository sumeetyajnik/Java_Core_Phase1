package sept2521.acessmodifier.am1;

public class TestM {

	public int intValueTestMPublic = 12;
	protected float floatValueTestMProtected = 5.764f;
	long longValueTestMDefault = 20000;

	public void methodPublic() {
		System.out.println("calling Class TestM - > methodPublic");
		methodPrivate();
		methodProtected();
		methodDefault();
	}

	private void methodPrivate() {
		System.out.println("calling Class TestM - > methodPrivate");
	}

	protected void methodProtected() {
		System.out.println("calling Class TestM - > methodProtected");
	}

	void methodDefault() {
		System.out.println("calling Class TestM - > methodDefault");
	}

}
