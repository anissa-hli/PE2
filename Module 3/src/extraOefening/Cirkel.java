package extraOefening;

public class Cirkel {
    private String kleur="wit";
    private float straal=0;

    public Cirkel(){;
    }

    public Cirkel(String kleur, float straal){
        this.kleur=kleur;
        this.straal=straal;
    }

    public Cirkel(float straal){
        this.straal=straal;
    }

    public Cirkel(String kleur){
        this.kleur=kleur;
    }

    public void setStraal(float straal){
        this.straal=straal;
    }
    public float getStraal(){
        return this.straal;
    }

    public void setKleur(String kleur){
        this.kleur=kleur;
    }
    public String getKleur(){
        return this.kleur;
    }

    public String toString(){
        return "Straal is "+getStraal()+" en kleur is "+getKleur();
    }

    public double geefOmtrek(){
        return 2 * Math.PI * this.straal;
    }
    public double geefOppervlakte(){
        return Math.PI * this.straal * this.straal;
    }

    public static void main(String[] strgs){

    }
}
