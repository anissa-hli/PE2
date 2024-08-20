package M6H1;

public class Smartphones extends Product {
    private Resolutie resolutie;

    public Smartphones(double prijs, String merknaam, String modelnummer, Resolutie resolutie) {
        super(prijs, merknaam, modelnummer);
        this.resolutie = resolutie;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Resolutie:"
                + resolutie.getBeschrijving();
    }
}
