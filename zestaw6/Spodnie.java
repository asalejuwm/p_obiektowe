public class Spodnie extends Ubranie{
    public Spodnie(){
        super();
    }
    public Spodnie(String nazwa, double cena, int iloscNaMagazynie){
        super(nazwa,cena,iloscNaMagazynie);
    }
    public void wypierz(){System.out.println("Piore");}
    public void zaloz(){System.out.println("Zakladam");}
    public void wyprasuj(){System.out.println("Prasuje");}
    public void wysusz(){System.out.println("Susze");}
    public void zniszcz(){System.out.println("Niszcze");}

}
