import java.util.*;
class RokProdukcjiComparator implements Comparator<Samochod> {
    @Override
    public int compare(Samochod s1, Samochod s2) {
        return Integer.compare(s1.getRokProdukcji(), s2.getRokProdukcji());
    }
}