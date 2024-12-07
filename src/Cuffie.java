public class Cuffie extends Prodotto {
    String colore;
    boolean isWireless;

    public Cuffie(String nomeProdotto, String marcaProdotto, float prezzoProdotto, float iva, String colore,
            boolean isWireless) {
        super(nomeProdotto, marcaProdotto, prezzoProdotto, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    // Bonus
    @Override
    public float getPrezzoScontato() {
        if (!isWireless) {
            return getPrezzoIva() * 0.93f; // Sconto del 7%
        }
        return super.getPrezzoScontato(); // Sconto base del 2%
    }
}
