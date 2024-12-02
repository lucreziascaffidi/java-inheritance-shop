public class Prodotto {

    protected int codiceProdotto;
    protected String nomeProdotto;
    protected String marcaProdotto;
    protected float prezzoProdotto;
    protected float iva;

    // Metodo Costruttore
    public Prodotto(int codiceProdotto, String nomeProdotto, String marcaProdotto, float prezzoProdotto, float iva) {
        this.codiceProdotto = codiceProdotto;
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

}
