import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;
    //konstruktory
    public Renifer() {
        this.imie="";
        this.predkosc=0;
    }
    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }
    //gettery
    public String getImie() {
        return imie;
    }

    public int getPredkosc() {
        return predkosc;
    }
    //settery
    public void setImie(String imie) {
        if(imie==null||imie.isEmpty()) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.imie=imie;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc<0) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.predkosc=predkosc;
    }
    //reszta funkcji
    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renifer renifer = (Renifer) o;
        return predkosc == renifer.predkosc && Objects.equals(imie, renifer.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }
    public void nakarmRenifera(){
        this.predkosc+=5;
    }
}
