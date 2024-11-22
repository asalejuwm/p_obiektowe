public class Produkt {
    String nazwa;
    public double cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje(){
        System.out.print("Nazwa: " + nazwa+", ");
        System.out.print("Cena: " + cena+", ");
        System.out.print("Ilosc na magazynie: " + iloscNaMagazynie+", ");
    }
    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie+=ilosc;
    }
    public void usunZMagazynu(int ilosc){
        if(iloscNaMagazynie>=ilosc){
            iloscNaMagazynie-=ilosc;
        }else{
            System.out.println("Podana wartosc przekracza ilosc na magazynie");
        }
    }
    public String getNazwa(){
        return nazwa;
    }
}

