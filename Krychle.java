// Krychle.java
public class Krychle implements Vypocet {
    private double a;

    public Krychle(double a) {
        this.a = a;
    }

    @Override
    public double vypocetObjemu() {
        return a * a * a;
    }

    @Override
    public double vypocetPlochy() {
        return 6 * (a * a);
    }
}