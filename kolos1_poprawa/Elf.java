import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;
    //konstruktory
    public Elf(){
        this.imie="";
        this.wiek=0;
        this.stanowisko="";
    }
    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    //gettery
    public String getImie(){return imie;}
    public int getWiek(){return wiek;}
    public String getStanowisko(){return stanowisko;}
    //settery
    public void setImie(String imie){
        if(imie==null||imie.isEmpty()) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.imie=imie;
    }
    public void setWiek(int wiek){
        if(wiek<=0) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.wiek=wiek;
    }
    public void setStanowisko(String stanowisko){
        if(stanowisko==null||stanowisko.isEmpty()) {
            throw new IllegalArgumentException("podano niewlasciwa wartosc");
        }
        this.stanowisko=stanowisko;
    }
    //reszta funkcji
    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
