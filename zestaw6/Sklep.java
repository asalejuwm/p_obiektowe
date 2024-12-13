import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class Sklep implements sklepInterface{
    private ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private Date dataPowstania;
    private Magazyn magazynSklepu;
    public Sklep(){
        produkty = new ArrayList<>();
        nazwaSklepu = "";
        dataPowstania = new Date();
        magazynSklepu = new Magazyn();
    }
    //gettery
    public ArrayList<Produkt> getProdukty(){
        return this.produkty;
    }
    public String getNazwaSklepu(){
        return this.nazwaSklepu;
    }
    public Date getDataPowstania(){
        return this.dataPowstania;
    }
    public Magazyn getMagazynSklepu(){
        return this.magazynSklepu;
    }
    //settery
    public void setProdukty(ArrayList<Produkt> produkty){
        if(produkty==null) {
            throw new IllegalArgumentException("Nie wolno");
        }
        this.produkty=produkty;
    }
    public void setNazwaSklepu(String nazwaSklepu){
        if(nazwaSklepu==null) {
            throw new IllegalArgumentException("Nie wolno");
        }
        this.nazwaSklepu=nazwaSklepu;
    }
    public void setDataPowstania(Date dataPowstania){
        if(dataPowstania==null||dataPowstania.after(new Date())) {
            throw new IllegalArgumentException("Nie wolno");
        }
        this.dataPowstania=dataPowstania;
    }
    public void setMagazynSklepu(Magazyn magazynSklepu){
        if(magazynSklepu==null) {
            throw new IllegalArgumentException("Nie wolno");
        }
        this.magazynSklepu=magazynSklepu;
    }

    @Override
    public String toString(){
        return "produkty='"+produkty+"', nazwa sklepu='"+nazwaSklepu+"', +data powstania='"+dataPowstania+"', magazyn sklepu='"+magazynSklepu+"'";
    }

    public void dodajProdukt(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nazwa nowego produktu: ");
        String nazwa = s.nextLine();
        Produkt check = wyszukajProdukt(nazwa);
        if(!check.getNazwa().equals(nazwa)){
            return;
        }
        System.out.print("Cena: ");
        double cena = s.nextDouble();
        Produkt p = new Produkt(nazwa,cena,0);
        produkty.add(p);
    }

    public void dodaj(Produkt p){
        this.produkty.add(p);
    }

    public void wyswietlOferty(){
        System.out.println("Dostepne produkty: ");
        for(Produkt p: produkty){
            System.out.print(p.getNazwa()+" "+p.getCena()+", ");
        }
    }

    public Produkt wyszukajProdukt(String nazwa){
        for(Produkt p : produkty){
            if(nazwa == p.getNazwa()){
                return p;
            }
        }
        return new Produkt();
    }

    public void zakupy(Produkt p, int ilosc, Zamowienie z){
        if(!z.getKoszykZakupowy().getProdukty().contains(p)&&ilosc<=p.getIloscNaMagazynie()) {
            z.getKoszykZakupowy().dodajProdukt(p,ilosc);
        }
    }

}
