package M4H1;

import java.time.LocalDate;

public abstract class Dier {
    private LocalDate geboortedatum;
    private static Dier[] kooi = new Dier[100];
    private static int kooicount = 0;
    private static Dier[] vijver = new Dier[100];
    private static int vijvercount= 0;


    public Dier(String geboortedatum){
        this.geboortedatum=LocalDate.parse(geboortedatum);

        if (this instanceof Zwemmen){
            if(vijvercount < vijver.length) {
                vijver[vijvercount] = this;
                vijvercount++;
            }
        }else if(this instanceof Vliegen){
            if(kooicount < kooi.length) {
                kooi[kooicount] = this;
                kooicount++;
            }
        }

        if(kooicount>0){
            System.out.println("In de kooi horen we: ");
            for(int i=0;i<kooicount;i++){
                kooi[i].maakGeluid();
            }
        }

        if(vijvercount>0){
            System.out.println("In de vijver horen we: ");
            for(int i=0;i<vijvercount;i++){
                vijver[i].maakGeluid();
            }
        }
    }
    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString(){
        return "Geboortedatum: "+geboortedatum+".\n";
    }

    public abstract void maakGeluid();

    public static void main(String[] strgs){
        Tijger miauw = new Tijger ("2024-06-01");
        Kikker kwak = new Kikker("2024-06-01");
        Zoogdier vleer = new Vleermuis("2024-06-01");

    }
}
