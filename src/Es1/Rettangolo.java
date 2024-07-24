package Es1;


public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(rettangolo1);

        System.out.println("Rettangolo 2:");
        stampaRettangolo(rettangolo2);

        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }


    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(4, 5);
        Rettangolo rettangolo2 = new Rettangolo(7, 3);


        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

    // Metodo getter
    public double getAltezza() {
        return altezza;
    }

    // Metodo setter
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }


    public double calcolaArea() {
        return altezza * larghezza;
    }


    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }
}
