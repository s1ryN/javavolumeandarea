public class Kuzel implements Vypocet{ 
    private double r, v;

    public Kuzel(double r, double v){
        this.r = r;
        this.v = v;
    }

    @Override
    public double vypocetObjemu(){
        return Math.PI * (r * r) * v / 3.0;
    }

    @Override
    public double vypocetPlochy(){
        double s = Math.sqrt((v * v)+(r * r));
        double sp = Math.PI * r * r;
        double spl = Math.PI * s * r;
        return sp + spl;
    }
    
}
