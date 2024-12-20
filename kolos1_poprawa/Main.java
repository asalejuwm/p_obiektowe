public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Andrzej",25,"logistyk");
        Renifer renifer1 = new Renifer("Rudolf",100);
        elf1.przedstawSie();
        renifer1.nakarmRenifera();
        System.out.println(renifer1.getPredkosc());
    }

}