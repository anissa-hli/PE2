package M4H1;

import java.time.LocalDate;

public class Kikker extends Amfibie implements Zwemmen {

    public Kikker(String geboortedatum){
        super(geboortedatum);
    }

    public void maakGeluid(){
        System.out.println("Kwakkk");
    }

    public void zwem(){};
}
