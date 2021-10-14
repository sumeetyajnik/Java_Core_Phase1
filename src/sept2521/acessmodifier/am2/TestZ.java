package sept2521.acessmodifier.am2;

import sept2521.acessmodifier.am1.TestM;
import sept2521.acessmodifier.am1.TestP;

public class TestZ extends TestM {

	public static void main(String[] args) {
		new TestP().methodPublic();
		new TestY().callTestY();
	}

}
