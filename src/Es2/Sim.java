package Es2;

import java.util.LinkedList;
import java.util.List;


public class Sim {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;


    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new LinkedList<>();
    }

    public static void main(String[] args) {

        Sim miaSim = new Sim("3328881778");


        miaSim.aggiungiCredito(7.20);


        miaSim.aggiungiChiamata(new Chiamata(5, "0987654321"));
        miaSim.aggiungiChiamata(new Chiamata(3, "1122334455"));
        miaSim.aggiungiChiamata(new Chiamata(10, "2233445566"));
        miaSim.aggiungiChiamata(new Chiamata(2, "3344556677"));
        miaSim.aggiungiChiamata(new Chiamata(7, "4455667788"));
        miaSim.aggiungiChiamata(new Chiamata(4, "5566778899")); // Questa chiamata farà scorrere la lista, rimuovendo la più vecchia


        miaSim.stampaDatiSim();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public List<Chiamata> getChiamate() {
        return chiamate;
    }


    public void aggiungiChiamata(Chiamata chiamata) {
        if (chiamate.size() == 5) {
            chiamate.remove(0); // Rimuove la chiamata più vecchia se la lista contiene già 5 chiamate
        }
        chiamate.add(chiamata);
    }


    public void aggiungiCredito(double importo) {
        if (importo > 0) {
            credito += importo;
        }
    }


    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");
        for (Chiamata chiamata : chiamate) {
            System.out.println(chiamata);
        }
    }
}
