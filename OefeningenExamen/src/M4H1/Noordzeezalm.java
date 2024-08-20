package M4H1;

import java.time.LocalDate;

public class Noordzeezalm extends Vis implements Zwemmen{
    public Noordzeezalm(String geboortedatum){
        super(geboortedatum);
    }

    public void maakGeluid(){
        System.out.println("Blub blub");
    }

    public void zwem(){};
}
