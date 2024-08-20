package M4H1;

import java.time.LocalDate;

public class Eend extends Vogel implements Zwemmen,Vliegen{

    public Eend(String geboortedatum){
        super(geboortedatum);
    }

    public void maakGeluid(){
        System.out.println("Eend eend");
    }
    public void zwem(){};
    public void vlieg(){};
}
