package M4H1;

import java.time.LocalDate;

public class Tijger extends Zoogdier implements Zwemmen{

    public Tijger(String geboortedatum){
        super(geboortedatum);
    }

    @Override
    public void maakGeluid(){
        System.out.println("As our good olg Katty Perry said: Roaaarr!");
    }

    public void zwem(){};
}
