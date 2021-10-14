package oct0321.telephone;

public class SmartTelephone extends Telephone {

	@Override
	public String with() {
		return "with";
	}

	@Override
	public String lift() {
		return "lift";
	}

	@Override
	public String disconnected() {
		return "disconnected";
	}

	public static void main(String[] args) {
		Telephone t;
		t = new SmartTelephone();
		System.out.println("SmartTelephone: " + t.with());
		System.out.println("SmartTelephone: " + t.lift());
		System.out.println("SmartTelephone: " + t.disconnected());
	}

}
