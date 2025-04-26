// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Vyberte tvar:");
            System.out.println("1. Krychle");
            System.out.println("2. Kvadr");
            System.out.println("3. Pyramida (čtvercová)");
            System.out.println("4. Jehlan (trojúhelníkový)");
            System.out.println("5. Kužel");
            System.out.println("6. Válec");
            System.out.println("7. Koule");
            System.out.println("8. Konec");
            int volba = sc.nextInt();
            if (volba == 8) {
                System.out.println("Konec programu.");
                break;
            }
            Vypocet tvar = null;
            switch (volba) {
                case 1:
                    System.out.print("Zadejte délku hrany: ");
                    double a = sc.nextDouble();
                    tvar = new Krychle(a);
                    break;
                case 2:
                    System.out.print("Zadejte délku strany a: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Zadejte délku strany b: ");
                    double b = sc.nextDouble();
                    System.out.print("Zadejte délku strany c: ");
                    double c = sc.nextDouble();
                    tvar = new Kvadr(a1, b, c);
                    break;
                case 3:
                    System.out.print("Zadejte délku strany základu: ");
                    double ap = sc.nextDouble();
                    System.out.print("Zadejte výšku: ");
                    double vp = sc.nextDouble();
                    tvar = new Pyramida(ap, vp);
                    break;
                case 4:
                    System.out.print("Zadejte délku strany základu: ");
                    double aj = sc.nextDouble();
                    System.out.print("Zadejte výšku: ");
                    double vj = sc.nextDouble();
                    tvar = new Jehlan(aj, vj);
                    break;
                case 5:
                    System.out.print("Zadejte poloměr základny: ");
                    double rk = sc.nextDouble();
                    System.out.print("Zadejte výšku: ");
                    double vk = sc.nextDouble();
                    tvar = new Kuzel(rk, vk);
                    break;
                case 6:
                    System.out.print("Zadejte poloměr základny: ");
                    double rv = sc.nextDouble();
                    System.out.print("Zadejte výšku: ");
                    double vv = sc.nextDouble();
                    tvar = new Valec(rv, vv);
                    break;
                case 7:
                    System.out.print("Zadejte poloměr koule: ");
                    double rr = sc.nextDouble();
                    tvar = new Koule(rr);
                    break;
                default:
                    System.out.println("Neplatná volba.");
                    continue;
            }
            System.out.printf("Objem: %.2f cm3%n", tvar.vypocetObjemu());
            System.out.printf("Plocha: %.2f cm2%n", tvar.vypocetPlochy());
        }
        sc.close();
    }
}