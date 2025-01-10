import java.util.*;
public class ProductComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2){
        int priceComparison = Double.compare(p1.getPrice(),p2.getPrice());
        if(priceComparison==0){
            return Integer.compare(p1.getId(),p2.getId());
        }
        return priceComparison;
    }
}
