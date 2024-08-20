package M4H1;

import java.time.LocalDate;

public class Vleermuis extends Zoogdier implements Vliegen{

    public Vleermuis(String geboortedatum){
        super(geboortedatum);
    }

    public void maakGeluid(){
        System.out.println("JJDBZJZLFK");
    }

    public void vlieg(){}
}
