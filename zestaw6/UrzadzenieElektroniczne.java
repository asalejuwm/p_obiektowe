public abstract class UrzadzenieElektroniczne extends ProduktPrzemyslowy {
    public UrzadzenieElektroniczne(){
        super();
    }
    public UrzadzenieElektroniczne(String nazwa, double cena, int iloscNaMagazynie){
        super(nazwa,cena,iloscNaMagazynie);
    }
    abstract void napraw();
    abstract void uzyj();
    abstract void zepsuj();
    abstract void wlacz();
    abstract void wylacz();
}
