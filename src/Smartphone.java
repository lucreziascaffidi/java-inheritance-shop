public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(String nomeProdotto, String marcaProdotto, float prezzoProdotto, float iva, String imei,
            int memoria) {
        super(nomeProdotto, marcaProdotto, prezzoProdotto, iva);
        this.imei = imei;
        this.memoria = memoria;
    };

    // Getter e Setter
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Bonus
    @Override
    public float getPrezzoScontato() {
        if (memoria < 32) {
            return getPrezzoIva() * 0.95f;
        }
        return super.getPrezzoScontato();
    }
}
