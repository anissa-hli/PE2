package M6H1;

public enum Resolutie {
    XLARGE ("xlarge screens",960,720),
    LARGE ("large screens",640, 480),
    NORMAL ("normal screens",470, 320),
    SMALL ("small screens", 426, 320);

    private final String beschrijving;
    private final int breedte, hoogte;

    private Resolutie(String beschrijving, int breedte, int hoogte) {
        this.beschrijving = beschrijving;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }
}
