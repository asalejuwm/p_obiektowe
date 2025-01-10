import java.util.*;
public class Main {
    public static void main(String[] args) {
        Samochod[] samochody = new Samochod[5];
        samochody[0] = new Samochod("Toyota", 2015, 45000.0);
        samochody[1] = new Samochod("BMW", 2020, 120000.0);
        samochody[2] = new Samochod("Audi", 2018, 90000.0);
        samochody[3] = new Samochod("Mercedes", 2016, 100000.0);
        samochody[4] = new Samochod("Fiat", 2013, 30000.0);
        Arrays.sort(samochody, new RokProdukcjiComparator());
        for (Samochod samochod : samochody) {
            System.out.println(samochod);
        }

        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 2500.99));
        products.add(new Product(1, "Smartphone", 999.99));
        products.add(new Product(5, "Tablet", 450.50));
        products.add(new Product(2, "Monitor", 450.50));
        products.add(new Product(4, "Keyboard", 120.00));
        products.sort(new ProductComparator());
        for (Product product : products) {
            System.out.println(product);
        }


    }
}