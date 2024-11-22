import java.util.ArrayList;
public class KoszykZakupowy {
    public ArrayList<Produkt> produkty;
    public ArrayList<Integer> ilosci;

    public KoszykZakupowy() {
        produkty = new ArrayList<>();
        ilosci = new ArrayList<>();
    }
    public KoszykZakupowy(ArrayList<Produkt> poczatkoweProdukty){
        this.produkty = new ArrayList<>(poczatkoweProdukty);
    }

    public void wyswietlProdukty() {
        if (produkty.isEmpty()) {
            System.out.println("Koszyk jest pusty");
        } else {
            System.out.println("Zawartosc koszyka: ");
            for (Produkt p : produkty) {
                System.out.println(p.getNazwa());
                System.out.println("Ilosc w koszyku: "+ilosci.get(produkty.indexOf(p)));
            }
        }
    }

    public void dodajProdukt(Produkt p, int ilosc){
        if(p.iloscNaMagazynie>=ilosc) {
            produkty.add(p);
            ilosci.add(ilosc);
            p.iloscNaMagazynie-=ilosc;
        }
        else{
            System.out.println("Podana wartosc przekracza ilosc na magazynie");
        }
    }
   public double obliczCalkowitaWartosc(){
        double res = 0;
        for (Produkt p : produkty) {
            res+=p.cena*ilosci.get(produkty.indexOf(p));
        }
        return res;
   }

}
