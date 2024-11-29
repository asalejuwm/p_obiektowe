
public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
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
        sklep.dodajProdukt(p1);
        sklep.dodajProdukt(p2);
        KoszykZakupowy koszyk1 = new KoszykZakupowy();
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        //k1.wyswietlProdukty();
        koszyk1.dodajProdukt(p1,5);
        koszyk1.dodajProdukt(p2,10);
        koszyk2.dodajProdukt(p2,13);
        //k1.wyswietlProdukty();
        //System.out.println(k1.obliczCalkowitaWartosc());
        Platnosc platnosc1 = new Platnosc();
        Zamowienie z1 = new Zamowienie(koszyk1,new Platnosc());
        Zamowienie z2 = new Zamowienie(koszyk2, new Platnosc());
        platnosc1 = new Platnosc(z2,"Nieoplacone");
        //z.wyswietlZamowienie();
        //z.ustawStatusZamowienia();
        //z.wyswietlZamowienie();
        Klient klient1 = new Klient("Mariusz","Pudzian");
        klient1.dodajZamowienie(z1);
        klient1.dodajZamowienie(z2);
        //klient1.wyswietlHistorieZamowien();
        //z1.ustawStatusZamowienia();
        //klient1.wyswietlHistorieZamowien();

        //System.out.println(koszyk1.obliczCalkowitaWartosc());
        //System.out.println(koszyk2.obliczCalkowitaWartosc());
        //System.out.println(klient1.obliczLacznyKosztZamowien());

        sklep.wyswietlOferty();

        sklep.zakupy(p1,2,z2);
        sklep.zakupy(p2,3,z2); //funkcja nie doda p2, bo ten produkt jest juz w zamowieniu
        z2.wyswietlZamowienie();
        /*
        z2.platnosc = platnosc1;
        System.out.println(platnosc1.statusPlatnosci);
        platnosc1.zaplac();
        System.out.println(platnosc1.statusPlatnosci);
        System.out.println(z2.platnosc==platnosc1);
        z2.finalizujZamowienie();
        System.out.println(z2.statusZamowienia);
         */

        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt(p1);
        magazyn.dodajProdukt(p2);
        //magazyn.wyswietlAsortyment();

        Adres adres1 = new Adres("Pudziana",5,8,"Tychy","99-999");
        adres1.pokaz();

        System.out.println("12-345".compareTo("12-344"));

        //throw new illegalargumentexception
        //@Override
        //to string

    }
}
