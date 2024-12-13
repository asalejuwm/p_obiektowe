import java.util.ArrayList;
public interface magazynInterface {
    //gettery
    ArrayList<Produkt> getProdukty();
    ArrayList<Integer> getIlosci();
    //settery
    void setProdukty(ArrayList<Produkt> produkty);
    void setIlosci(ArrayList<Integer> ilosci);
    //inne funkcje
    String toString();
    void dodajProdukt(Produkt produkt);
    String asortyment();

}
