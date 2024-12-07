public class Televisori extends Prodotto {
    private int dimensioni;
    private boolean isSmart;

    public Televisori(String nomeProdotto, String marcaProdotto, float prezzoProdotto, float iva, int dimensioni,
            boolean isSmart) {
        super(nomeProdotto, marcaProdotto, prezzoProdotto, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // Getter e Setter
    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    // Bonus
    @Override
    public float getPrezzoScontato() {
        if (!isSmart) {
            return getPrezzoIva() * 0.90f; // Sconto del 10%
        }
        return super.getPrezzoScontato(); // Sconto base del 2%
    }

}
