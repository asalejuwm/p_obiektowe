public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    // Konstruktor
    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    // Gettery
    public String getMarka() {
        return marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka='" + marka + '\'' + ", rokProdukcji=" + rokProdukcji + ", cena=" + cena + '}';
    }
}

