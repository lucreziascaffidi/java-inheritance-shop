import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrello carrello = new Carrello();

        System.out.println("Benvenuto nello shop! Iniziamo a riempire il carrello.");

        while (true) {
            System.out.println("\nChe prodotto vuoi aggiungere?");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisore");
            System.out.println("3 - Cuffie");
            System.out.println("0 - Fine");

            int scelta = Integer.parseInt(scanner.nextLine());

            if (scelta == 0) {
                break; // Termina l'aggiunta di prodotti
            }

            System.out.println("Inserisci il nome del prodotto:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la marca del prodotto:");
            String marca = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            float prezzo = Float.parseFloat(scanner.nextLine());

            System.out.println("Inserisci l'IVA del prodotto (percentuale):");
            float iva = Float.parseFloat(scanner.nextLine());

            switch (scelta) {
                case 1 -> { // Smartphone
                    System.out.println("Inserisci il codice IMEI:");
                    String imei = scanner.nextLine();

                    System.out.println("Inserisci la quantità di memoria (GB):");
                    int memoria = Integer.parseInt(scanner.nextLine());

                    Smartphone smartphone = new Smartphone(nome, marca, prezzo, iva, imei, memoria);
                    carrello.aggiungiProdotto(smartphone);
                }
                case 2 -> { // Televisore
                    System.out.println("Inserisci le dimensioni (pollici):");
                    int dimensioni = Integer.parseInt(scanner.nextLine());

                    System.out.println("Il televisore è Smart? (true/false):");
                    boolean isSmart = Boolean.parseBoolean(scanner.nextLine());

                    Televisori televisore = new Televisori(nome, marca, prezzo, iva, dimensioni, isSmart);
                    carrello.aggiungiProdotto(televisore);
                }
                case 3 -> { // Cuffie
                    System.out.println("Inserisci il colore delle cuffie:");
                    String colore = scanner.nextLine();

                    System.out.println("Le cuffie sono Wireless? (true/false):");
                    boolean isWireless = Boolean.parseBoolean(scanner.nextLine());

                    Cuffie cuffie = new Cuffie(nome, marca, prezzo, iva, colore, isWireless);
                    carrello.aggiungiProdotto(cuffie);
                }
                default -> System.out.println("Scelta non valida. Riprova.");
            }
        }

        // Bonus
        System.out.println("\nHai una tessera fedeltà? (true/false)");
        boolean hasFidelityCard = Boolean.parseBoolean(scanner.nextLine());

        // Stampa il contenuto del carrello
        System.out.println("\nRiepilogo del carrello:");
        carrello.stampaCarrello();

        if (hasFidelityCard) {
            System.out.println("Totale con sconto fedeltà: " + carrello.calcolaTotaleScontato() + "€");
        } else {
            System.out.println("Totale senza sconto: " + carrello.calcolaTotale() + "€");
        }

        scanner.close();
    }
}
