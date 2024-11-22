public class Main {
    public static void main(String[] args) {
    Produkt p1 = new Produkt("Pomidor",7.49,50);
    /*
    p1.wyswietlInformacje();
    p1.dodajDoMagazynu(5);
    p1.wyswietlInformacje();
    p1.usunZMagazynu(10);
    p1.wyswietlInformacje();
     */
    Produkt p2 = new Produkt("Woda niegazowana",1.99,1000);
    //p2.wyswietlInformacje();
    KoszykZakupowy koszyk1 = new KoszykZakupowy();
    //k1.wyswietlProdukty();
    koszyk1.dodajProdukt(p1,5);
    koszyk1.dodajProdukt(p2,10);
    //k1.wyswietlProdukty();
    //System.out.println(k1.obliczCalkowitaWartosc());
    Zamowienie z1 = new Zamowienie(koszyk1);
    //z.wyswietlZamowienie();
    //z.ustawStatusZamowienia();
    //z.wyswietlZamowienie();
    Klient klient1 = new Klient("Mariusz","Pudzian");
    klient1.dodajZamowienie(z1);
    klient1.wyswietlHistorieZamowien();
    //z1.ustawStatusZamowienia();
    //klient1.wyswietlHistorieZamowien();


    }
}