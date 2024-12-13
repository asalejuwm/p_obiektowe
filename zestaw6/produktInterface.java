public interface produktInterface {
    //gettery
    String getNazwa();
    double getCena();
    int getIloscNaMagazynie();
    //settery
    void setNazwa(String nazwa);
    void setCena(double cena);
    void setIloscNaMagazynie(int iloscNaMagazynie);
    //reszta funkcji
    String toString();
    boolean equals(Object obj);
    void dodajDoMagazynu(int ilosc);
    void usunZMagazynu(int ilosc);
}
