package M4M2;

public class Bediende extends Persoon {
    private Lokaal lokaal;

    public Bediende(String voornaam, String achternaam, Lokaal lokaal){
        super(voornaam,achternaam);
        this.lokaal=lokaal;
    }

    public Lokaal getLokaal() {
        return lokaal;
    }

    void setLokaal(Bediende bediende,Lokaal lokaal){
        bediende.lokaal=lokaal;
    }

    @Override
    public String toString(){
        return super.toString() + " heeft als lokaal " + lokaal ;
    }

}
