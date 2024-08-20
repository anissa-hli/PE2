package Oefening4;

public class Auto {
    private double kilometerteller;
    private double brandstoftank;
    private double maxtank;
    private double verbruik;

    public Auto(double kilometerteller,double maxtank,double brandstoftank,double verbruik){
        this.kilometerteller=kilometerteller;
        this.brandstoftank=brandstoftank;
        this.verbruik=verbruik;
        this.maxtank=maxtank;
    }

    public Auto (double maxtank, double verbruik){
        kilometerteller=0;
        brandstoftank=0;
        this.verbruik=verbruik;
        this.maxtank=maxtank;
    }

    public double tanken(){
        double aantalLiters=maxtank-brandstoftank;
        brandstoftank=maxtank;
        return aantalLiters;
    }

    public double rijden(double km){
        double liter=verbruik/100*Math.abs(km);
        if(liter<=brandstoftank){
            kilometerteller+=km;
            brandstoftank-=liter;
            return km;
        }else{
            double effectief=brandstoftank/liter;
            kilometerteller+=effectief;
            brandstoftank=0;
            return effectief;

        }
    }
    public String toString(){
        return "Kilometerteller:"+kilometerteller+" Brandstoftank:"+brandstoftank+" Verbruik:"+verbruik;
    }

    public static void main(String[] strgs){
        Auto BMW=new Auto(0,300,200,100);
        BMW.rijden(200);
        System.out.println(BMW);
    }
}
