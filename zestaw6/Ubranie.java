public abstract class Ubranie extends ProduktPrzemyslowy {
    public Ubranie(){
        super();
    }
    public Ubranie(String nazwa, double cena, int iloscNaMagazynie){
        super(nazwa,cena,iloscNaMagazynie);
    }
    abstract void wypierz();
    abstract void zaloz();
    abstract void wyprasuj();
    abstract void wysusz();
    abstract void zniszcz();
}
