import java.util.Random;

public class Prodotto {

    private int codiceProdotto;
    private String nomeProdotto;
    private String marcaProdotto;
    private float prezzoProdotto;
    private float iva;

    // Metodo Costruttore
    public Prodotto(String nomeProdotto, String marcaProdotto, float prezzoProdotto, float iva) {
        Random random = new Random();
        this.codiceProdotto = random.nextInt(7777777);
        this.nomeProdotto = nomeProdotto;
        this.marcaProdotto = marcaProdotto;
        this.prezzoProdotto = prezzoProdotto;
        this.iva = iva;
    }

    // Getter e Setter
    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public String getMarcaProdotto() {
        return marcaProdotto;
    }

    public void setMarcaProdotto(String marcaProdotto) {
        this.marcaProdotto = marcaProdotto;
    }

    public float getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(float prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    // Metodi utili
    public float getPrezzoBase() {
        return prezzoProdotto;
    }

    public float getPrezzoIva() {
        return prezzoProdotto + (prezzoProdotto * iva / 100);
    }

    // Bonus per il calcolo del prezzo scontato, di base sempre del 2%
    public float getPrezzoScontato() {
        return getPrezzoIva() * 0.98f;
    }
}
