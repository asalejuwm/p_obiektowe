import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
public class printUniqueTest {
    public static <T> void printUnique(Collection<T> c){
        HashSet <T>uniqueSet = new HashSet(c);
        for(T item : uniqueSet){
            System.out.println(item);
        }
    }
    public static <T> int countOccurences(Collection<T> c, T element){
        int count = 0;
        for(T item : c){
            if(item.equals(element)){
                count++;
            }
        }
        return count;
    }
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }
    public static <T> boolean isPalindrome(LinkedList<T> list){
        int size = list.size();
        for(int i = 0; i < size/2; i++){
            if(list.get(i) != list.get(size-1-i)){
                return false;
            }
        }
        return true;
    }
    public static <T> HashSet<T> findUniqueElements(List<T> list){
        HashSet result = new HashSet();
        for(T item : list){
            result.add(item);
        }
        return result;
    }
    public static <T extends Comparable<T>> TreeSet<T> findElemtentsInRange(TreeSet<T> list, T lowerBound, T upperBound){
        return (TreeSet<T>)list.subSet(lowerBound, upperBound);
    }
    public static <K,V> HashMap<V, Integer> countValueOccurences(HashMap<K,V> map){
        HashMap<V,Integer> result = new HashMap<>();
        for(Map.Entry<K,V> entry : map.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            if(result.containsKey(value)){
                result.put(value, result.get(value) + 1);
            }
            else{
                result.put(value, 1);
            }
        }
        return result;
    }
    public static <K extends Comparable<K>,V> TreeMap<K,V> subMapInRange(TreeMap<K,V> map, K startKey, K endKey){
        TreeMap<K,V> result = new TreeMap<>();
        for(Map.Entry<K,V> entry : map.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            if(key.compareTo(startKey)>=0 && key.compareTo(endKey)<=0){
                result.put(key, value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeSet<Integer> list1 = new TreeSet<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        System.out.println(findElemtentsInRange(list1,3,6));

    }
}
