import java.util.ArrayList;
public interface koszykInterface {
    //gettery
    ArrayList<Produkt> getProdukty();
    ArrayList<Integer> getIlosci();
    Produkt getProdukt(int index);
    Integer getIlosc(int index);
    //settery
    void setProdukty(ArrayList<Produkt> produkty);
    void setIlosci(ArrayList<Integer> ilosci);
    //reszta funkcji
    void removeProdukt(int index);
    String toString();
    String zawartoscKoszyka();
    void wyswietlProdukty();
    boolean zawieraProdukt(Produkt p);
    int indexProduktu(Produkt p);
    void setIlosc(int index, int ilosc);
    void dodajProdukt(Produkt p, int ilosc);
    double obliczCalkowitaWartosc();


}
