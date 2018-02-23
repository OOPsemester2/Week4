/** En boks med en længde, bredde og højde */
public class Boks3
{
	private double længde;
	private double bredde;
	private double højde;

	/** konstruktør der opretter en standardboks */
	public Boks3()
	{
		System.out.println("Standardboks oprettes");
		længde = 10.0;
		bredde = 10.0;
		højde  = 10.0;
	}

	/** en anden konstruktør der får bredde, højde og længde */
	public Boks3(double lgd, double b, double h)
	{
		System.out.println("Boks oprettes med lgd="+lgd+" b="+b+" h="+h);
		sætMål(lgd,b,h);
	}

	/** sætter boksens bredde, højde og længde */
	public void sætMål(double lgd, double b, double h)
	{
		if (lgd<=0 || b<=0 || h<=0)
		{
 			System.out.println("Ugyldige mål. Bruger standardmål.");
			længde = 10.0;
			bredde = 10.0;
			højde  = 10.0;
		} else {
			længde = lgd;
			bredde = b;
			højde  = h;
		}
	}

	/** udregner boksens rumfang */
	public double volumen()
	{
		double vol = længde*bredde*højde ;
		return vol;
	}
}
