import java.util.ArrayList;
public class Magazyn implements magazynInterface {
    private ArrayList<Produkt> produkty;
    private ArrayList<Integer> ilosci;
    public Magazyn(){
        this.produkty = new ArrayList<>();
        this.ilosci = new ArrayList<>();
    }
    //gettery
    public ArrayList<Produkt> getProdukty(){
        return this.produkty;
    }
    public ArrayList<Integer> getIlosci(){
        return this.ilosci;
    }
    //settery
    public void setProdukty(ArrayList<Produkt> produkty){
        if(produkty==null){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.produkty=produkty;
    }
    public void setIlosci(ArrayList<Integer> ilosci){
        if(ilosci==null){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.ilosci=ilosci;
    }

    @Override
    public String toString(){
        return "asortyment='"+asortyment()+"'";
    }
    public void dodajProdukt(Produkt produkt){
        if(produkty.contains(produkt)){
            System.out.println("Taki produkt juz istnieje na magazynie");
        }else{
            produkty.add(produkt);
            ilosci.add(produkt.getIloscNaMagazynie());
        }
    }
    public String asortyment(){
        String res = "";
        for(int i=0; i<produkty.size(); i++){
            res+="("+produkty.get(i).getNazwa()+", "+ilosci.get(i)+"), ";
        }
        if (!res.isEmpty()) {
            res = res.substring(0, res.length() - 2);
        }
        return res;
    }
}