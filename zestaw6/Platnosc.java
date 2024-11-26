public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(){
        this.kwota = 0;
        this.statusPlatnosci = "Nieoplacone";
    }
    public Platnosc(Zamowienie z, String status){
        this.kwota = z.koszykZakupowy.obliczCalkowitaWartosc();
        this.statusPlatnosci = status;
    }

    public void zaplac(){
        this.statusPlatnosci = "Oplacone";
        this.kwota = 0;
    }

}

