import java.util.ArrayList;
import java.util.Date;
public interface sklepInterface {
    //gettery
    ArrayList<Produkt> getProdukty();
    String getNazwaSklepu();
    Date getDataPowstania();
    Magazyn getMagazynSklepu();
    //settery
    void setProdukty(ArrayList<Produkt> produkty);
    void setNazwaSklepu(String nazwaSklepu);
    void setDataPowstania(Date dataPowstania);
    void setMagazynSklepu(Magazyn magazynSklepu);
    //inne funkcje
    String toString();
    void dodajProdukt();
    void dodaj(Produkt p);
    void wyswietlOferty();
    Produkt wyszukajProdukt(String nazwa);
    void zakupy(Produkt p, int ilosc, Zamowienie z);
    default void powitanie(){
        System.out.println("Witamy w naszej sieci sklepów!");
    }
}
