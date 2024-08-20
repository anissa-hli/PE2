package M6H1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class Testverkoop {
    private Map<String, List<Product> toestellen;

    public Testverkoop(){
        toestellen = new HashMap<>();
        toestellen.put("smartphones",new ArrayList<>());
        toestellen.put("smartwatches",new ArrayList<>());

    }




    //Binnen de applicatie zelf houden we een verzameling bij waar we voor de keys smartphones en smartglasses
    // een lijst van toestellen opslaan. Binnen deze lijsten moeten de toestellen op naam gesorteerd worden.
    //
    //“Test Verkoop” wil ook de mogelijk bieden om lijsten op andere manieren te sorteren.
    // Voorzie methoden om toestellen ook op prijs en merknaam te kunnen sorteren.
}
