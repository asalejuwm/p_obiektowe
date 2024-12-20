import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> Elfy;
    private double dlGeo;
    private double szGeo;
    //konstruktory
    public Fabryka(){
        Elfy = new ArrayList<>();
        this.dlGeo=0;
        this.szGeo=0;
    }
    public Fabryka(ArrayList<Elf> elfy, double dlGeo, double szGeo) {
        Elfy = elfy;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }
    //gettery
    public ArrayList<Elf> getElfy() {
        return Elfy;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public double getSzGeo() {
        return szGeo;
    }
    //settery
    public void setElfy(ArrayList<Elf> elfy) {
        if(elfy==null) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.Elfy = elfy;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo>=-180 && dlGeo<=180) {
            this.dlGeo = dlGeo;
        }
    }

    public void setSzGeo(double szGeo) {
        if(szGeo>=-90 && szGeo<=90) {
            this.szGeo = szGeo;
        }
    }
    //reszta funkcji
    @Override
    public String toString() {
        return "Fabryka{" +
                "Elfy=" + Elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return Double.compare(dlGeo, fabryka.dlGeo) == 0 && Double.compare(szGeo, fabryka.szGeo) == 0 && Objects.equals(Elfy, fabryka.Elfy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Elfy, dlGeo, szGeo);
    }

    public void dodajPracownika(Elf elf){
        this.Elfy.add(elf);
    }
    public void usunPracownika(Elf elf){
        this.Elfy.remove(elf);
    }
    public Elf najstarszyPracownik(){
        if(this.Elfy.isEmpty()){
            return null;
        }
        int maxWiek = Elfy.get(0).getWiek();
        Elf najstarszy = Elfy.get(0);
        for(Elf elf: this.Elfy){
            if(elf.getWiek()>maxWiek){
                maxWiek = elf.getWiek();
                najstarszy = elf;
            }
        }
        return najstarszy;
    }
}
