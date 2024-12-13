import java.util.ArrayList;
public interface klientInterface {
    //gettery
    String getImie();
    String getNazwisko();
    ArrayList<Zamowienie> getListaZamowien();
    Adres getAdres();
    //settery
    void setImie(String imie);
    void setNazwisko(String nazwisko);
    void setListaZamowien(ArrayList<Zamowienie> listaZamowien);
    void setAdres(Adres adres);
    //reszta funkcji
    void dodajZamowienie(Zamowienie z);
    String toString();
    boolean equals(Object obj);
    double obliczLacznyKosztZamowien();


}
