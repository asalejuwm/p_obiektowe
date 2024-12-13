public class Jablko extends Owoc {
    public Jablko(){
        super();
    }
    public Jablko(String nazwa, double cena, int iloscNaMagazynie){
        super(nazwa,cena,iloscNaMagazynie);
    }
    public void smak() {
        System.out.println("Kwasne");
    }
    public void umyj() {
        System.out.println("Myju myju");
    }
    public void zjedz() {
        System.out.println("Omnomnommnomoonom");
    }
}
