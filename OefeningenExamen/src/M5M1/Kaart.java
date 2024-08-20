package M5M1;

public class Kaart {

    private Kleur kleur;
    private Waarde waarde;

    public Kaart(Kleur kleur, Waarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return waarde.toString().toLowerCase() + " van " + kleur.toString().toLowerCase();
    }


    public static void main(String[] args) {
        Kaart[][] kaarten = new Kaart[4][13];
        Kleur[] Kleuren= Kleur.values();
        Waarde[] Waarden= Waarde.values();

            for (int i =0; i< Kleuren.length; i++){
            for (int j =0; j< Waarden.length; j++){
                kaarten[i][j]=new Kaart(Kleuren[i],Waarden[j]);
            }
        }

        for (int i = 0; i < kaarten.length; i++) {
            for (int j = 0; j < kaarten[i].length; j++) {
                System.out.println(kaarten[i][j].toString());
            }
        }
    }
}
