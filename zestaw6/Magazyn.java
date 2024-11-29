import java.util.ArrayList;
public class Magazyn {
    public ArrayList<Produkt> produkty;
    public ArrayList<Integer> ilosci;
    public Magazyn(){
        this.produkty = new ArrayList<>();
        this.ilosci = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt){
        if(produkty.contains(produkt)){
            System.out.println("Taki produkt juz istnieje na magazynie");
            return;
        }else{
            produkty.add(produkt);
            ilosci.add(produkt.iloscNaMagazynie);
        }
    }
    public void wyswietlAsortyment(){
        System.out.println("Asortyment magazynu: ");
        for(int i=0; i<produkty.size(); i++){
            System.out.print(produkty.get(i).nazwa+" "+ilosci.get(i)+",\t");
        }
    }
}
