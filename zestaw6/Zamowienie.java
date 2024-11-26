import java.util.Scanner;
public class Zamowienie {
    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;
    public Platnosc platnosc;

    public Zamowienie(KoszykZakupowy k, Platnosc platnosc) {
        this.koszykZakupowy = k;
        this.statusZamowienia = "w trakcie realizacji";
        this.platnosc = platnosc;
    }
    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlProdukty();
        System.out.println("Status zamowienia: "+statusZamowienia);
    }
    public void ustawStatusZamowienia(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nowy status zamowienia: ");
        statusZamowienia = s.nextLine();
    }
    public void finalizujZamowienie(){
        if(!("Oplacone").equals(this.platnosc.statusPlatnosci)){
            System.out.println(this.platnosc.statusPlatnosci+"!=Oplacone");
            System.out.println("Platnosc nie jest jeszcze oplacona!");
            return;
        }
        this.statusZamowienia = "Gotowe do wysylki";
    }
    public void zwrocProdukt(Produkt p, int ilosc) {
        if (!this.koszykZakupowy.produkty.contains(p)) {
            System.out.println("Nie ma takiego produktu w koszyku!");
            return;
        }
        int index = this.koszykZakupowy.produkty.indexOf(p);
        if (ilosc > this.koszykZakupowy.ilosci.get(index)) {
            System.out.println("Podano wieksza ilosc produktu niz jest w koszyku!");
            return;
        }

        this.koszykZakupowy.ilosci.set(index, this.koszykZakupowy.ilosci.get(index) - ilosc);
        p.iloscNaMagazynie+=ilosc;

        if (this.koszykZakupowy.ilosci.get(index) == 0) {
            this.koszykZakupowy.produkty.remove(index);
            this.koszykZakupowy.ilosci.remove(index);
        }
        this.platnosc.kwota = this.koszykZakupowy.obliczCalkowitaWartosc();
    }

}
