package Oefening5;
//Op een BankRekening staat een bepaald bedrag. Voorzie een default constructor die dat bedrag op 0.0 zet,
//en een tweede constructor die toelaat om een positieve double door te geven. Als er een negatief getal
//doorgegeven wordt, mag je het bedrag van de bankrekening op 0 zetten.
//Voorzie een getter en setter voor het bedrag. Probeer de gebruiker van de klasse echter te verplichten om ipv
//de setter gebruik te maken van de methoden uit de volgende paragraaf.
//Voorzie methoden om geld te storten en om geld af te halen. Bij een afhaling mag er in het rood gegaan
//worden, maar niet meer dan 1000 euro. Als dat wel het geval zou zijn, mag je de afhaling weigeren.
//Zorg er natuurlijk ook voor dat het object zijn gegevens kan afprinten

public class Bankrekening {
    public double bedrag;

    public Bankrekening(){
        setBedrag(0);
    }

    public Bankrekening(double bedrag){
        if(bedrag<0){
            this.bedrag=0;
        }else{
            this.bedrag=bedrag;
        }
    }

    private void setBedrag(double bedrag){
        this.bedrag=bedrag;
    }

    public double getBedrag(){
        return bedrag;

    }

    public boolean afhalen(double bedrag){
        if(this.bedrag-bedrag>=-1000) {
            setBedrag(getBedrag()-bedrag);
            return true;
        }else{
            return false;
        }
    }

    public void storten(double bedrag){
        setBedrag(getBedrag()+bedrag);

    }

    public String toString(){
        return "Bedrag:"+bedrag;
    }

    public static void main (String[] strgs){
        Bankrekening anissa=new Bankrekening(400);
        anissa.storten(600);
        System.out.println(anissa);
        anissa.afhalen(400);
        System.out.println(anissa);
        anissa.afhalen(1610);
        System.out.println(anissa);

    }
}
