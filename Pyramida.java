// Pyramida.java (čtvercová pyramida)
public class Pyramida implements Vypocet {
    private double a, v; // a = délka strany základu, v = výška

    public Pyramida(double a, double v) {
        this.a = a;
        this.v = v;
    }

    @Override
    public double vypocetObjemu() {
        return a * a * v / 3.0;
    }

    @Override
    public double vypocetPlochy() {
        double s = Math.sqrt((a / 2.0) * (a / 2.0) + v * v);
        return a * a + 2 * a * s;
    }
}