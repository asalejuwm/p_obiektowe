import java.util.Scanner;
public class Zamowienie {
    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;

    public Zamowienie(KoszykZakupowy k) {
        this.koszykZakupowy = k;
        this.statusZamowienia = "w trakcie realizacji";
    }
    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlProdukty();
        System.out.println("Status zamowienia: "+statusZamowienia);
    }
    public void ustawStatusZamowienia(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nowy status zamowienia: ");
        statusZamowienia = s.nextLine();
    }
}
