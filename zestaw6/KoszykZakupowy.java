import java.util.ArrayList;
public class KoszykZakupowy implements koszykInterface {
    private ArrayList<Produkt> produkty;
    private ArrayList<Integer> ilosci;

    public KoszykZakupowy() {
        produkty = new ArrayList<>();
        ilosci = new ArrayList<>();
    }
    public KoszykZakupowy(ArrayList<Produkt> poczatkoweProdukty){
        this.produkty = new ArrayList<>(poczatkoweProdukty);
    }
    //gettery
    public ArrayList<Produkt> getProdukty(){
        return this.produkty;
    }
    public ArrayList<Integer> getIlosci(){
        return this.ilosci;
    }
    public Produkt getProdukt(int index){
        return this.produkty.get(index);
    }
    public Integer getIlosc(int index){
        return this.ilosci.get(index);
    }
    //settery
    public void setProdukty(ArrayList<Produkt> produkty){
        if(produkty==null){throw new IllegalArgumentException("Nie wolno");}
        this.produkty=produkty;
    }
    public void setIlosci(ArrayList<Integer> ilosci){
        if(ilosci==null){throw new IllegalArgumentException("Nie wolno");}
        this.ilosci=ilosci;
    }

    public void removeProdukt(int index){
        this.produkty.remove(index);
        this.ilosci.remove(index);
    }

    @Override
    public String toString(){
        return "zawartosc koszyka='"+zawartoscKoszyka()+"'";
    }

    public String zawartoscKoszyka(){
        String res = "";
        for(int i=0; i<produkty.size(); i++){
            res+="("+produkty.get(i).getNazwa()+", "+ilosci.get(i)+"), ";
        }
        if (!res.isEmpty()) {
            res = res.substring(0, res.length() - 2);
        }
        return res;
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

    public boolean zawieraProdukt(Produkt p){
        return this.produkty.contains(p);
    }
    public int indexProduktu(Produkt p){
        return this.produkty.indexOf(p);
    }
    public void setIlosc(int index, int ilosc){
        this.ilosci.set(index, ilosc);
    }

    public void dodajProdukt(Produkt p, int ilosc){
        if(p.getIloscNaMagazynie()>=ilosc) {
            this.produkty.add(p);
            this.ilosci.add(ilosc);
            p.setIloscNaMagazynie(p.getIloscNaMagazynie()-ilosc);
        }
        else{
            System.out.println("Podana wartosc przekracza ilosc na magazynie");
        }
    }
    public double obliczCalkowitaWartosc(){
        double res = 0;
        for (int i=0;i<produkty.size();i++){
            res+=produkty.get(i).getCena()*ilosci.get(i);
        }
        return res;
    }

}