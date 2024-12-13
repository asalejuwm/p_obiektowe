public class Adres implements adresInterface {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private String kodPocztowy;
    public Adres(){
        this.ulica = "";
        this.numerDomu = 0;
        this.miasto = "";
        this.kodPocztowy = "";
    }
    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    //gettery
    public String getUlica(){
        return this.ulica;
    }
    public int getNumerDomu(){
            return this.numerDomu;
    }
    public int getNumerMieszkania(){
            return this.numerMieszkania;
    }
    public String getMiasto(){
            return this.miasto;
    }
    public String getKodPocztowy(){
            return this.kodPocztowy;
    }
    //settery
    public void setUlica(String ulica){
        if(ulica==null){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.ulica=ulica;
    }
    public void setNumerDomu(int numerDomu){
        if(numerDomu==0){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.numerDomu=numerDomu;
    }
    public void setNumerMieszkania(int numerMieszkania){
        this.numerMieszkania=numerMieszkania;
    }
    public void setMiasto(String miasto){
        if(miasto==null){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.miasto=miasto;
    }
    public void setKodPocztowy(String kodPocztowy){
        if(kodPocztowy==null){
            throw new IllegalArgumentException("Nie wolno");
        }
        this.kodPocztowy=kodPocztowy;
    }

    @Override
    public String toString(){
        return "Adres(ulica='"+ulica+"', numer domu='"+numerDomu+"', numer mieszkania='"+numerMieszkania+"', miasto='"+miasto+"', kod pocztowy='"+kodPocztowy+"'";
    }

    public boolean przed(Adres adres){
        return this.kodPocztowy.compareTo(adres.kodPocztowy)<0;
    }

}