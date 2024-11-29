public class Adres {
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miasto;
    String kodPocztowy;
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

    public void pokaz(){
        System.out.println(kodPocztowy+" "+miasto);
        //System.out.println(ulica+" "+numerDomu+"/"+numerMieszkania);
        System.out.print(ulica+" "+numerDomu);
        if(numerMieszkania!=0){
            System.out.println("/"+numerMieszkania);
        }
    }

    public boolean przed(Adres adres){
        return this.kodPocztowy.compareTo(adres.kodPocztowy)<0;
    }

}
