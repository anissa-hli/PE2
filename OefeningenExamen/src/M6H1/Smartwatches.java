package M6H1;

public class Smartwatches extends Product{
    private Vorm vorm;

    public Smartwatches(double prijs, String merknaam, String modelnummer, Vorm vorm) {
        super(prijs, merknaam, modelnummer);
        this.vorm = vorm;
    }

    public String toString() {
        return super.toString() + "\n Vorm:"
                + vorm;
    }
}
