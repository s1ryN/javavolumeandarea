public class Koule implements Vypocet {
    private double r;

    public Koule(double r) {
        this.r = r;
    }

    @Override
    public double vypocetObjemu() {
        return 4.0 / 3.0 * Math.PI * r * r * r;
    }

    @Override
    public double vypocetPlochy() {
        return 4 * Math.PI * r * r;
    }
}