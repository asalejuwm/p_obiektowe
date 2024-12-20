import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> Renifery;
    //konstrukory
    public Sanie(){
        this.Renifery = new ArrayList<>();
    }
    public Sanie(ArrayList<Renifer> Renifery){
        this.Renifery = Renifery;
    }
    //gettery
    public ArrayList<Renifer> getRenifery(){
        return this.Renifery;
    }
    //settery
    public void setRenifery(ArrayList<Renifer> Renifery){
        if(Renifery.isEmpty()){
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.Renifery = Renifery;
    }
    //reszta funkcji

    @Override
    public String toString() {
        return "Sanie{" +
                "Renifery=" + Renifery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(Renifery, sanie.Renifery);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Renifery);
    }
    public void dodajRenifera(Renifer renifer){
        this.Renifery.add(renifer);
    }
    public int sumaPredkosci(){
        int suma = 0;
        for(Renifer renifer : this.Renifery){
            suma+=renifer.getPredkosc();
        }
        return suma;
    }
    public Renifer najwolniejszyRenifer(){
        if(this.Renifery.isEmpty()){
            return null;
        }
        int minPredkosc = this.Renifery.get(0).getPredkosc();
        Renifer najwolniejszy = this.Renifery.get(0);
        for(Renifer renifer : this.Renifery){
            if(renifer.getPredkosc() < minPredkosc){
                minPredkosc = renifer.getPredkosc();
                najwolniejszy = renifer;
            }
        }
        return najwolniejszy;
    }

}
