package M4H1;

import java.time.LocalDate;

public class Pinguin extends Vogel implements Zwemmen{

    public Pinguin(String geboortedatum){
        super(geboortedatum);
    }

    public void maakGeluid(){
        System.out.println("Pinggggggggguin");
    }

    public void zwem(){};
}
