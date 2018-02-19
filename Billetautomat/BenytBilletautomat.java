//package automat;

public class BenytBilletautomat {
	public static void main(String[] arg) {
		Billetautomat automat = new Billetautomat();
		java.util.Scanner tastatur = new java.util.Scanner(System.in); // forbered

		System.out.println("BenytBilletautomat version 3");
		System.out.println();

		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("En billet koster " + automat.getBilletpris() + " kroner");
			System.out.println("Balancen er paa " + automat.getBalance() + " kroner");
			System.out.println();
			System.out.println("Tast 1 for at indbetale penge");
			System.out.println("Tast 2 for at udskrive din billet");
			System.out.println("Tast 3 for at faa returpengene");
			System.out.println("Tast 4 for at faa balance");
			System.out.println();
			System.out.println("Tast 10 for at logge ind som montoer");
			if (automat.erMontoer()) {
				System.out.println("Tast 11 for at se status (montoer)");
				System.out.println("Tast 12 for at nulstille (montoer)");
				System.out.println("Tast 13 for at saette billetpris (montoer)");
				System.out.println("Tast 14 for at logge ud af montoertilstand");
			}
			int valg = tastatur.nextInt();
			tastatur.nextLine();

			if (valg == 1) {
				System.out.print("Skriv beloeb: ");
				int beloeb = tastatur.nextInt();
				automat.indsaetPenge(beloeb);
			} else if (valg == 2) {
				while (automat.zoner() < 1) {
					System.out.print("Indtast zoner:");
					int zone = tastatur.nextInt();
					automat.zones(zone);
				}
				automat.udskrivBillet();
			} else if (valg == 3) {
				int beloeb = automat.returpenge();
				System.out.println("Du fik " + beloeb + " retur retur");
			} else if (valg == 4) {
				System.out.printf("Du har %d paa balancen\n", automat.getBalance());
			} else if (valg == 10) {
				System.out.print("Skriv kode: ");
				String kode = tastatur.next();
				automat.montoerLogin(kode);
			} else if (valg == 11) {
				System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
				System.out.println("Total indkomst: " + automat.getTotal() + " kr");
			} else if (valg == 12) {
				automat.nulstil();
			} else if (valg == 13) {
				System.out.print("Skriv beloeb: ");
				int beloeb = tastatur.nextInt();
				automat.setBilletpris(beloeb);
			} else if (valg == 14) {
				automat.montoerLogin("");
				;
			} else {
				System.out.println("Ugyldigt valg, proev igen");
			}
		}
		tastetur.colse();
	}
}
