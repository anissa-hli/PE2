package M6E2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Student {
    //Maak een lijst met de namen van studenten en gebruik een methode om deze in willekeurige volgorde
    // te krijgen.
    // Druk deze lijst af in de console.
    // Zoek hiervoor de shuffle methode van Collections even op
    public static void main(String[] args) {
        ArrayList<String> naamStudenten = new ArrayList<>();
        naamStudenten.add("Anissa");
        naamStudenten.add("Johan");
        naamStudenten.add("Kim");
        naamStudenten.add("Simbabawe");
        naamStudenten.add("Naim");
        naamStudenten.add("Issa");
        naamStudenten.add("Mohamed");

        Collections.shuffle(naamStudenten);
        System.out.println(naamStudenten);
    }
}
