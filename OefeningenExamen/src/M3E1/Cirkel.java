package M3E1;

public class Cirkel {
    private float straal=0;
    private String kleur="wit";

    public Cirkel(){
    }

    public Cirkel(float straal){
        this.straal=straal;
    }

    public Cirkel(float straal, String kleur){
        this.straal=straal;
        this.kleur=kleur;
    }

    public void setStraal(float straal){
        this.straal=straal;
    }

    public void setKleur(String kleur){
        this.kleur=kleur;
    }

    public float getStraal(){
       return straal;
    }

    public String getKleur(){
        return kleur;
    }

    public String toString(){
        return "Een cirkel met straal " + straal + " en als kleur " + kleur;

    }


    public static void main(String[] strgs) {
        Cirkel cirkel = new Cirkel();
        System.out.println(cirkel);
    }
}

