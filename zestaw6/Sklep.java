import java.util.Scanner;
import java.util.ArrayList;
public class Sklep {
ArrayList<Produkt> produkty;
public Sklep(){
    produkty = new ArrayList<>();
}
public void dodajProdukt(){
    Scanner s = new Scanner(System.in);
    System.out.print("Nazwa nowego produktu: ");
    String nazwa = s.nextLine();
    Produkt check = wyszukajProdukt(nazwa);
    if(!check.nazwa.equals(nazwa)){
        return;
    }
    System.out.print("Cena: ");
    double cena = s.nextDouble();
    Produkt p = new Produkt(nazwa,cena,0);
    produkty.add(p);
}

public void dodaj(Produkt p){
    produkty.add(p);
}

public void wyswietlOferty(){
    System.out.println("Dostepne produkty: ");
    for(Produkt p: produkty){
        System.out.print(p.nazwa+" "+p.cena+", ");
    }
}

public Produkt wyszukajProdukt(String nazwa){
    for(Produkt p : produkty){
        if(nazwa == p.nazwa){
            return p;
        }
    }
    return new Produkt();
}

public void zakupy(Produkt p, int ilosc, Zamowienie z){
    if(!z.koszykZakupowy.produkty.contains(p)&&ilosc<=p.iloscNaMagazynie) {
        z.koszykZakupowy.produkty.add(p);
        z.koszykZakupowy.ilosci.add(ilosc);
        p.iloscNaMagazynie-=ilosc;
    }
}

}
