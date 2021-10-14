package sept2521.acessmodifier.am2;

public class TestX {

	private int intValueTestXPublic = 27;
	long longValueTestXDefault = 99887688;
	protected float floatValueTestXProtected = 48.9478f;
	public char charValueTestXPublic = 'a';

	public int methodPublic() {
		System.out.println("calling Class TestX - > methodPublic");
		return intValueTestXPublic;
	}

}
