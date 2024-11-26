import java.util.ArrayList;
public class Klient {
    public String imie;
    public String nazwisko;
    public ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("Lista zamowien dla klienta " + imie + " " + nazwisko + ": ");
        for (Zamowienie z : listaZamowien) {
            z.wyswietlZamowienie();
        }
    }
    public double obliczLacznyKosztZamowien(){
        double res = 0;
        for(Zamowienie z : listaZamowien){
            res+=z.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return res;
    }

}
