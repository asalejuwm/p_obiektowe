import java.util.ArrayList;
public class KlientFirmowy extends Klient {
    private final String NIP;
    private final String REGON;
    public KlientFirmowy(String imie, String nazwisko, Adres adres, String NIP, String REGON){
        super(imie,nazwisko,adres);
        this.NIP = NIP;
        this.REGON = REGON;
    }

}