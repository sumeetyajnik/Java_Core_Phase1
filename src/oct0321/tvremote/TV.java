package oct0321.tvremote;

public class TV implements SmartTVremote {

	@Override
	public String on() {
		return "1";
	}

	@Override
	public String off() {
		return "0";
	}

	@Override
	public String voice() {
		return "V";
	}

	public static void main(String[] args) {
		TV tv = new TV();

		System.out.println("on: " + tv.on());
		System.out.println("off: " + tv.off());
		System.out.println("voice: " + tv.voice());
	}
}
