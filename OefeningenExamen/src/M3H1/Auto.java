package M3H1;

public class Auto {
    private double kilometerteller;
    private double brandstoftank;
    private final double volleTank;
    private double verbruik;

    public Auto(double kilometerteller, double brandstoftank, double volleTank, double verbruik) {
        this.kilometerteller = kilometerteller;
        this.brandstoftank = brandstoftank;
        this.volleTank = volleTank;
        this.verbruik = verbruik;
    }

    //default waarden - nieuwe auto
    public Auto(double volleTank, double verbruik) {
        this(0, 0, volleTank, verbruik);
    }

    public void rijden(double teRijdenKilometers) {
        if (teRijdenKilometers < 0) {
            teRijdenKilometers *= -1;
        }

        double nodigeLiters = (verbruik / 100) * teRijdenKilometers;
        if (nodigeLiters <= brandstoftank) {
            kilometerteller += teRijdenKilometers;
            brandstoftank -= nodigeLiters;
        } else {
            kilometerteller += brandstoftank * (verbruik/100);
            brandstoftank = 0;
        }
    }

    public void tankVullen(){
        brandstoftank=volleTank;
    }

    public  void print()    {
        System.out.println("Teller: " + kilometerteller);
        System.out.println("Verbruik: "+verbruik);
        System.out.println("Max capaciteit tank: "+ volleTank);
        System.out.println("Inhoud tank: " + brandstoftank);
    }

public static void main (String[] strgs){
Auto BMW=new Auto(0,50,50,100);
BMW.print();
BMW.rijden(100);
BMW.print();


}
}