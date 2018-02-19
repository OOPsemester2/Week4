//package kapitel_04;

public class BenytTerning_v2 {
	public static void main(String[] arg) {
		Terning t = new Terning(); // opret terning
		ArrayList<String> terning = new ArrayList<String>();

		// Slaa nu med terningen indtil vi faar en sekser
		boolean sekser = false;
		int antalKast = 0;

		while (sekser == false) {
			t.kast();
			terning.add(t.getVaerdi());
			antalKast++;
			System.out.println("kast " + antalKast + ": " + t.getVaerdi());
			if (t.getVaerdi() == 6)
				sekser = true;
		}

		System.out.println("Vi slog en 6'er efter " + antalKast + " slag.");
	}
}
