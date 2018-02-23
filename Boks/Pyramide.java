/** En boks med en laengde, bredde og hoejde */
public class Pyramide {
  private double side;
  private double hoejde;

  /** konstruktoer der opretter en standardboks */
  public Pyramide() {
    System.out.println("\nStandardpyramide oprettes");
    side = 10.0;
    hoejde = 10.0;
  }

  /** en anden konstruktoer der faar bredde, hoejde og laengde */
  public Pyramide(double s, double h) {
    System.out.println("\nPyramide oprettes med s=" + s + " h=" + h);
    saetMaal(s, h);
  }

  /** saetter boksens bredde, hoejde og laengde */
  public void saetMaal(double s, double h) {
    if (s <= 0 || h <= 0) {
      System.out.println("Ugyldige maal. Bruger standardmaal.");
      side = 10.0;
      hoejde = 10.0;
    } else {
      side = s;
      hoejde = h;
    }
  }

  /** udregner boksens rumfang */
  public double volumen() {
    double vol = (side * side * hoejde) / 4;
    return vol;
  }
}
