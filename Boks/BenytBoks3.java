public class BenytBoks3 {
	public static void main(String[] arg) {
		Boks3 enBoks = new Boks3(); // brug konstruktoeren uden parametre
		System.out.println("Volumen er: " + enBoks.volumen());
		System.out.println("Vaegten er: " + enBoks.Vaegten());

		Boks3 enAndenBoks = new Boks3(5, 5, 10, 10); // brug den anden konstruktoer
		System.out.println("Volumen er: " + enAndenBoks.volumen());
		System.out.println("Vaegten er: " + enAndenBoks.Vaegten());
	}
}
