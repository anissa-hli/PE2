package M6H1;

import java.util.TreeSet;

public class Product implements Comparable<Product> {
    private double prijs;
    private String merknaam, modelnummer;

    public Product(double prijs, String merknaam, String modelnummer) {
        this.prijs = prijs;
        this.merknaam = merknaam;
        this.modelnummer = modelnummer;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public String getModelnummer() {
        return modelnummer;
    }

    public int compareTo(Product other){
        return this.merknaam.compareTo(other.merknaam);
    }
    public String toString(){
        return merknaam + " " + modelnummer + " (" + prijs +" euro)";
    }
//Alle producten bevatten een prijs, merknaam en modelnummer
    //smartwatches kunnen rond of vierkant zijn.
    //Smartphones hebben een schermresolutie.



}
