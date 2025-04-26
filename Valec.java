public class Valec implements Vypocet {
    private double r, v;

    public Valec(double r, double v) {
        this.r = r;
        this.v = v;
    }

    @Override
    public double vypocetObjemu() {
        return Math.PI * r * r * v;
    }

    @Override
    public double vypocetPlochy() {
        return 2 * Math.PI * r * (r + v);
    }
}