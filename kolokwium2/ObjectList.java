import java.util.*;
class ObjectList<T> implements Comparable<T>{
    List<T> list;
    @Override
    public int compareTo(T other) {
        return Integer.compare(this.hashCode(),other.hashCode());
    }
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(8);
        list1.add(3);
        list1.add(2);
        ObjectList<Integer> example = new ObjectList<>();
        example.list = list1;
        Collections.sort(example.list, Collections.reverseOrder());
        System.out.println(example.list);
    }
}
