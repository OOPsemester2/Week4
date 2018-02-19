import java.util.Scanner;
import java.util.ArrayList;

public class BenytTerning_v2 {
	public static void main(String[] arg) {
		Terning t = new Terning(); // opret terning
		Scanner console = new Scanner(System.in);

		System.out.print("Indtast antal terninger: ");
		int antalTerninger = console.nextInt();

		System.out.print("Indtast antal 6'er i et slag: ");
		int antalSekser = console.nextInt();

		// Slaa nu med terningen indtil vi faar en sekser
		int sekser = 0;
		int antalKast = 0;
		System.out.println();
		while (sekser != antalSekser) {
			sekser = 0;
			ArrayList<String> terning = new ArrayList<String>();
			for (int i = 0; i <= antalTerninger - 1; i++) {
				t.kast();
				terning.add("" + t.getVaerdi());
			}
			antalKast++;
			for (int i = 0; i <= antalTerninger - 1; i++) {
				System.out.printf("Terning %d gav %S\n", i, terning.get(i));
				if (terning.get(i).equals("6")) {
					sekser++;
				}
			}
			System.out.println();
		}
		System.out.printf("\nVi slog %d 6'er efter %d kast", sekser, antalKast);
		console.colse();
	}
}
