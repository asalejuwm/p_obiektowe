import java.util.Scanner;
public class Zamowienie implements zamowienieInterface{
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy k, Platnosc platnosc) {
        this.koszykZakupowy = k;
        this.statusZamowienia = "w trakcie realizacji";
        this.platnosc = platnosc;
    }
    //gettery
    public KoszykZakupowy getKoszykZakupowy(){
        return this.koszykZakupowy;
    }
    public String getStatusZamowienia(){
        return this.statusZamowienia;
    }
    public Platnosc getPlatnosc(){
        return this.platnosc;
    }
    //settery
    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy){
        if(koszykZakupowy==null){throw new IllegalArgumentException("Nie wolno");}
        this.koszykZakupowy=koszykZakupowy;
    }
    public void setStatusZamowienia(String statusZamowienia){
        if(statusZamowienia==null){throw new IllegalArgumentException("Nie wolno");}
        this.statusZamowienia=statusZamowienia;
    }
    public void setPlatnosc(Platnosc platnosc){
        if(platnosc==null){throw new IllegalArgumentException("Nie wolno");}
        this.platnosc=platnosc;
    }
    @Override
    public String toString(){
        return koszykZakupowy.toString()+", status zamowienia='"+statusZamowienia+"', platnosc='"+platnosc.toString()+"'";
    }


    public void ustawStatusZamowienia(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nowy status zamowienia: ");
        statusZamowienia = s.nextLine();
    }
    public void finalizujZamowienie(){
        if(!("Oplacone").equals(this.platnosc.getStatusPlatnosci())){
            System.out.println(this.platnosc.getStatusPlatnosci()+"!=Oplacone");
            System.out.println("Platnosc nie jest jeszcze oplacona!");
            return;
        }
        this.statusZamowienia = "Gotowe do wysylki";
    }
    public void zwrocProdukt(Produkt p, int ilosc) {
        if (!this.koszykZakupowy.zawieraProdukt(p)) {
            System.out.println("Nie ma takiego produktu w koszyku!");
            return;
        }
        int index = this.koszykZakupowy.indexProduktu(p);
    if (ilosc > this.koszykZakupowy.getIlosc(index)) {
            System.out.println("Podano wieksza ilosc produktu niz jest w koszyku!");
            return;
        }

        this.koszykZakupowy.setIlosc(index, this.koszykZakupowy.getIlosc(index)-ilosc);
        p.setIloscNaMagazynie(p.getIloscNaMagazynie()+ilosc);

        if (this.koszykZakupowy.getIlosc(index) == 0) {
            this.koszykZakupowy.removeProdukt(index);
        }
        this.platnosc.setKwota(this.koszykZakupowy.obliczCalkowitaWartosc());
    }

}