public class BenytBoks3
{
	public static void main(String[] arg)
	{
		Boks3 enBoks = new Boks3();             // brug konstruktøren uden parametre
		System.out.println("Volumen er: "+ enBoks.volumen());

		Boks3 enAndenBoks = new Boks3(5, 5, 10);  // brug den anden konstruktør
		System.out.println("Volumen er: "+ enAndenBoks.volumen());
	}
}
