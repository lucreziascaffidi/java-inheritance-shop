import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> prodotti;

    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    // Metodo per aggiungere un prodotto al carrello
    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    // Calcola il totale del carrello (prezzo con IVA)
    public float calcolaTotale() {
        float totale = 0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getPrezzoIva();
        }
        return totale;
    }

    // Stampa il contenuto del carrello
    public void stampaCarrello() {
        System.out.println("Carrello:");
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.getClass().getSimpleName() + " - " + prodotto.getNomeProdotto() +
                    " (" + prodotto.getMarcaProdotto() + ") Prezzo con IVA: " + prodotto.getPrezzoIva() + "€");
        }
        System.out.println("Totale carrello: " + calcolaTotale() + "€");
    }
}
