public class KlientIndywidualny extends Klient{
    private final String PESEL;
    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String PESEL){
        super(imie,nazwisko,adres);
        this.PESEL=PESEL;
    }
}
