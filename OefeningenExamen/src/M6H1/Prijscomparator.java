package M6H1;

import java.util.Comparator;

public class Prijscomparator implements Comparator<Product> {

    public int compare(Product p1, Product p2){
        return Double.compare(p1.getPrijs(),p2.getPrijs());
    }
}
