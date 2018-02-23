/** En boks med en laengde, bredde og hoejde */
public class Boks3 {
  private double laengde;
  private double bredde;
  private double hoejde;
  private double massefylde;

  /** konstruktoer der opretter en standardboks */
  public Boks3() {
    System.out.println("Standardboks oprettes");
    laengde = 10.0;
    bredde = 10.0;
    hoejde = 10.0;
    massefylde = 10.0;
  }

  /** en anden konstruktoer der faar bredde, hoejde og laengde */
  public Boks3(double lgd, double b, double h, double m) {
    System.out.println("Boks oprettes med lgd=" + lgd + " b=" + b + " h=" + h + " m=" + m);
    saetMaal(lgd, b, h, m);
  }

  /** saetter boksens bredde, hoejde og laengde */
  public void saetMaal(double lgd, double b, double h, double m) {
    if (lgd <= 0 || b <= 0 || h <= 0 || m <= 0) {
      System.out.println("Ugyldige maal. Bruger standardmaal.");
      laengde = 10.0;
      bredde = 10.0;
      hoejde = 10.0;
      massefylde = 10.0;
    } else {
      laengde = lgd;
      bredde = b;
      hoejde = h;
      massefylde = m;
    }
  }

  /** udregner boksens rumfang */
  public double volumen() {
    double vol = laengde * bredde * hoejde;
    return vol;
  }

  public double Vaegten() {
    double masse = massefylde * (laengde * bredde * hoejde);
    return masse;
  }
}
