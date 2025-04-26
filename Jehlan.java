// Jehlan.java (trojúhelníkový jehlan)
public class Jehlan implements Vypocet {
    private double a, v; // a = délka strany trojúhelníkového základu, v = výška

    public Jehlan(double a, double v) {
        this.a = a;
        this.v = v;
    }

    @Override
    public double vypocetObjemu() {
        double baseArea = Math.sqrt(3) / 4.0 * a * a;
        return baseArea * v / 3.0;
    }

    @Override
    public double vypocetPlochy() {
        double baseArea = Math.sqrt(3) / 4.0 * a * a;
        double s = Math.sqrt((a / 2.0) * (a / 2.0) + v * v);
        double lateralArea = 3 * (a * s) / 2.0;
        return baseArea + lateralArea;
    }
}