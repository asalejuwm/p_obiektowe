public class Produkt implements produktInterface {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(){
        this.nazwa="";
        this.cena = 0;
        this.iloscNaMagazynie = 0;
    }

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    //gettery
    public String getNazwa(){
        return this.nazwa;
    }
    public double getCena(){
        return this.cena;
    }
    public int getIloscNaMagazynie(){
        return this.iloscNaMagazynie;
    }
    //settery
    public void setNazwa(String nazwa){
        if(nazwa==null){throw new IllegalArgumentException("Nie wolno");}
        this.nazwa=nazwa;
    }
    public void setCena(double cena){
        if(cena<=0){throw new IllegalArgumentException("Nie wolno");}
        this.cena=cena;
    }
    public void setIloscNaMagazynie(int iloscNaMagazynie){
        if(iloscNaMagazynie<0){throw new IllegalArgumentException("Nie wolno");}
        this.iloscNaMagazynie=iloscNaMagazynie;
    }

    @Override
    public String toString(){
        return "nazwa+'"+nazwa+"', cena='"+cena+"', ilosc na magazynie='"+iloscNaMagazynie+"'";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produkt other = (Produkt) obj;
        return (nazwa != null ? nazwa.equals(other.nazwa) : other.nazwa == null)
                && Double.compare(cena, other.cena) == 0;
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
}
