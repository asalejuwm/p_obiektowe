public interface zamowienieInterface {
    //gettery
    KoszykZakupowy getKoszykZakupowy();
    String getStatusZamowienia();
    Platnosc getPlatnosc();
    //settery
    void setKoszykZakupowy(KoszykZakupowy koszykZakupowy);
    void setStatusZamowienia(String statusZamowienia);
    void setPlatnosc(Platnosc platnosc);
    //reszta funkcji
    void ustawStatusZamowienia();
    void finalizujZamowienie();
    void zwrocProdukt(Produkt p,int ilosc);

}
