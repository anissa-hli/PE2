package M6M1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Wagen implements {
    //Onze startup heeft nood aan een systeem om de verhuur van wagens bij te kunnen houden.
    // Zorg voor een collection waar je een nummerplaat aan een wagen kan koppelen.
    // Om het voor ons eenvoudig te houden sorteren we alles alfabetisch op de nummerplaat.
    // Voor de nummerplaten mag je een String gebruiken, voor de wagens maak je een aparte klasse.
    // De klasse Wagen bevat een serienummer, brandstoftype, aantal zitplaatsen en een boolean om te weten of
    // de wagen verhuurd is. Voorzie zeker een methode om wagens op te zoeken aan de hand van een nummerplaat
    // en methodes om een wagen te verhuren.


    private String serienummer, brandstoftype;
    private int zitplaatsen;
    private boolean isVerhuurd;

    public Wagen(String serienummer, String brandstoftype, int zitplaatsen){
        this.serienummer=serienummer;
        this.brandstoftype=brandstoftype;
        this.zitplaatsen=zitplaatsen;
        this.isVerhuurd=false;
    }



    @Override
    public String toString() {
        return "Wagen{" +
                ", serienummer='" + serienummer + '\'' +
                ", brandstoftype='" + brandstoftype + '\'' +
                ", zitplaatsen=" + zitplaatsen +
                ", isVerhuurd=" + isVerhuurd +
                '}';
    }
}
