import java.util.ArrayList;
import java.util.Date;

/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int billetpris; // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
	private boolean montoertilstand;
	private int zone;

	ArrayList<String> log = new ArrayList<String>();
	Date time = new Date();

	/**
	 * Opret en billetautomat der saelger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Giver prisen for en billet.
	 */
	public int getBilletpris() {
		int resultat = billetpris;
		return resultat;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	public void indsaetPenge(int beloeb) {
		balance = balance + beloeb;
		log.add(new Date() + " er der indsaeted: " + beloeb + " kr.");
	}

	/**
	 * Giver balancen (beloebet maskinen har modtaget til den naeste billet).
	 */
	public int getBalance() {
		return balance;
	}

	public void zones(int zones) {
		zone = zones;
	}

	public int zoner() {
		return zone;
	}

	/**
	* Udskriv en billet.
	* Opdater total og nedskriv balancen med billetprisen
	*/
	public void udskrivBillet() {
		if (balance < billetpris * zone) {
			System.out.println("Du mangler at indbetale nogle penge");
		} else {

			System.out.println("##########B##T#########");
			System.out.println("# BlueJ Trafikselskab #");
			System.out.println("#                     #");
			System.out.println("#        Billet       #");
			System.out.println("#        " + billetpris * zone + " kr.       #");
			System.out.println("#        zoner         #");
			System.out.println("#        " + zone + "       #");
			System.out.println("#                     #");
			System.out.println("##########B##T#########");
			System.out.println("# Du har " + (balance - (billetpris * zone)) + " kr til gode       #");
			System.out.println("##########B##T#########");
			System.out.println();

			log.add(new Date() + " er der koebt en billet til: " + billetpris * zone + " kr." + " med: " + zone + " zoner");
			antalBilletterSolgt = antalBilletterSolgt + 1;
			balance = balance - (billetpris * zone); // Billetter koster 10 kroner
			zone = 0;
		}
	}

	public int returpenge() {
		int returbeloeb = balance;
		balance = 0;
		System.out.println("Du faar " + returbeloeb + "  kr retur");
		log.add(new Date() + " er der retuneret " + returbeloeb + " kr.");
		return returbeloeb;
	}

	void montoerLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			montoertilstand = true;
			System.out.println("Montoertilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
		} else {
			montoertilstand = false;
			System.out.println("Montoertilstand deaktiveret");
		}
	}

	public int getTotal() {
		if (montoertilstand) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (montoertilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
		this.billetpris = billetpris;
	}

	public void nulstil() {
		if (montoertilstand) {
			antalBilletterSolgt = 0;
		} else {
			System.out.println("Afvist - log ind foerst");
		}
	}

	public void getLog() {
		if (montoertilstand) {
			int localSize = log.size();
			if (localSize > 0) {
				for (int i = 0; i < localSize; i++) {
					System.out.println(log.get(0));
					log.remove(0);
				}
			} else {
				System.out.println("Ingen ny data siden sidst!");
			}
		} else {
			System.out.println("Afvist - log ind foerst");
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (montoertilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind foerst");
		}
	}

	public boolean erMontoer() {
		return montoertilstand;
	}
}
