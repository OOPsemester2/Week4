//package kapitel_04;

/** En klasse der beskriver 6-sidede terninger */
public class Terning {
	/** antallet af øjne paa den side paa terningen, der vender opad lige nu */
	private int vaerdi;

	/** konstruktør der opretter en terning */
	public Terning() {
		// vaelg en tilfaeldig side til at starte med
		vaerdi = (int) (Math.random() * 6 + 1);
	}

	/** kaster terningen, saa den faar en anden vaerdi */
	public void kast() {
		// vaelg en tilfaeldig side
		double tilfaeldigtTal = Math.random();
		vaerdi = (int) (tilfaeldigtTal * 6 + 1);
	}

	/** Aflaeser terningens vaerdiæøå */
	public int getVaerdi() {
		return vaerdi;
	}

	/** Saetter terningens vaerdi */
	public void setVaerdi(int nyVaerdi) {
		vaerdi = nyVaerdi;
	}

	/** giver en beskrivelse af terningen som en streng */
	public String toString() {
		String svar = "" + vaerdi; // vaerdi som streng, f.eks. "4"
		return svar;
	}
}
