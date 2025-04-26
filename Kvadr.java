// Kvadr.java
public class Kvadr implements Vypocet {
    private double a, b, c;

    public Kvadr(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double vypocetObjemu() {
        return a * b * c;
    }

    @Override
    public double vypocetPlochy() {
        return 2 * (a * b + a * c + b * c);
    }
}
