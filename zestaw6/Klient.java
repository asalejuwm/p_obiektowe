import java.util.ArrayList;
public class Klient extends Osoba implements klientInterface {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(){
        this.imie="";
        this.nazwisko="";
        this.listaZamowien = new ArrayList<>();
        this.adres = new Adres();
    }

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
        this.adres=adres;
    }
    //gettery
    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public ArrayList<Zamowienie> getListaZamowien(){
        return this.listaZamowien;
    }
    public Adres getAdres(){
        return this.adres;
    }
    //settery
    public void setImie(String imie){
        if(imie==null){throw new IllegalArgumentException("Nie wolno");}
        this.imie=imie;

    }
    public void setNazwisko(String nazwisko){
        if(nazwisko==null){throw new IllegalArgumentException("Nie wolno");}
        this.nazwisko=nazwisko;
    }
    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien){
        if(listaZamowien==null){throw new IllegalArgumentException("Nie wolno");}
        this.listaZamowien=listaZamowien;
    }
    public void setAdres(Adres adres){
        if(adres==null){throw new IllegalArgumentException("Nie wolno");}
        this.adres=adres;
    }

    public void dodajZamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }

    @Override
    public String toString(){
        return "imie='"+imie+"', nazwisko='"+nazwisko+"', lista zamowien='"+listaZamowien+"', adres='"+adres+"'";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Klient other = (Klient) obj;
        return (imie != null ? imie.equals(other.imie) : other.imie == null)
                && (nazwisko != null ? nazwisko.equals(other.nazwisko) : other.nazwisko == null)
                && (adres != null ? adres.equals(other.adres) : other.adres == null);
    }

    /*
    public void wyswietlHistorieZamowien() {
        System.out.println("Lista zamowien dla klienta " + imie + " " + nazwisko + ": ");
        for (Zamowienie z : listaZamowien) {
            z.wyswietlZamowienie();
        }
    }
    */

    public double obliczLacznyKosztZamowien(){
        double res = 0;
        for(Zamowienie z : listaZamowien){
            res+=z.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return res;
    }

}
