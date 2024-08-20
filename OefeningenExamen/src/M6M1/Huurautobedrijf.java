package M6M1;


import java.util.Map;
import java.util.TreeMap;

public class Huurautobedrijf {
    private Map<String, Wagen> wagens;

    public void toevoegen(Wagen w){
        wagens.put(w.getNummerplaat(),w);
    }

    public Wagen zoeken (String nummerplaat){
        return wagens.get(nummerplaat);
    }
}
