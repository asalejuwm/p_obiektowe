import java.util.*;
class Box<T>{
    T objekt;
    public void setObjekt(T objekt){
        this.objekt = objekt;
    }
    public T getObjekt(){
        return objekt;
    }
}

class Counter<T>{
    List<T> lista = new ArrayList<T>();
    public void add(T objekt){
        lista.add(objekt);
    }
    public int getCount(){
        return lista.size();
    }
    public void wypisz(){
        for(T element : lista){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
}

class Animal{
    private String name;
    private int ownersCount;
    public Animal(String name, int ownersCount){
        this.name = name;
        this.ownersCount = ownersCount;
    }
    public String getName(){
        return name;
    }
    public int getOwnersCount(){
        return ownersCount;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + '}';
    }
}
class Dog extends Animal{
    private String race;
    private int age;
    public Dog(String name, int ownersCount, String race, int age){
        super(name,ownersCount);
        this.race = race;
        this.age=age;
    }
    public String getRace(){
        return race;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Dog{name="+ getName()+", ownersCount="+getOwnersCount()+", race="+getRace()+", age="+getAge()+'}';
    }
}
class Pair<T>{
    private T first;
    private T second;
    public Pair(){
    }
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}

public class TestPunkt {
    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }
    public static <T> void swap(List<T> lista, int index1, int index2){
        try {
            Collections.swap(lista, index1, index2);
        }catch (Exception e) {
            throw new IndexOutOfBoundsException("incorrect index");
        }
    }
    public static <T extends Comparable<T>> T minValue(List<T> lista){
        if(lista==null || lista.isEmpty()){
            return null;
        }
        return Collections.min(lista);
    }
    public static <T extends Animal> T findMax(T element1, T element2){
        return element1.getOwnersCount()>element2.getOwnersCount()?element1:element2;
    }
    public static void findMinMaxAge(Dog[] dogs,Pair<? super Dog> result){
        if(dogs==null || dogs.length==0){
            throw new IllegalArgumentException("empty dogs");
        }
        Dog minDog = dogs[0];
        Dog maxDog = dogs[0];
        for(Dog dog:dogs){
            if(dog.getAge()<minDog.getAge()){
                minDog=dog;
            }
        }
        for(Dog dog:dogs){
            if(dog.getAge()>maxDog.getAge()){
                maxDog=dog;
            }
        }
        result.setFirst(minDog);
        result.setSecond(maxDog);
    }
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setObjekt("Objekt1");
        //System.out.println(box1.getObjekt());

        Box<Integer> box2 = new Box<>();
        box2.setObjekt(2);
        //System.out.println(box2.getObjekt());

        Box<Integer> box3 = new Box<>();
        box3.setObjekt(2);
        //System.out.println(isEqual(box2.getObjekt(),box1.getObjekt()));
        //System.out.println(isEqual(box3.getObjekt(),box2.getObjekt()));

        Counter<String> counterString = new Counter();
        counterString.add("d");
        counterString.add("x");
        counterString.add("p");
        //System.out.println(counter.getCount());

        Counter<Integer> counterInt = new Counter();
        counterInt.add(1);
        counterInt.add(2);
        counterInt.add(3);
        //System.out.println(counterInt.getCount());

        Counter<Double> counterDouble = new Counter();
        counterDouble.add(1.0);
        counterDouble.add(2.3);
        counterDouble.add(3.6);
        counterDouble.add(4.9);
        //counterDouble.wypisz();
        swap(counterDouble.lista, 1, 3);
        //counterDouble.wypisz();
        //System.out.println(minValue(counterDouble.lista));
        //System.out.println(minValue(counterString.lista));
        //System.out.println(minValue(counterInt.lista));

        Animal bobr = new Animal("Jerzy", 0);
        Dog pies1 = new Dog("Andrzej", 3, "dalmatynczyk",5);
        System.out.println(findMax(bobr, pies1));

        Dog pies2 = new Dog("Reks",1,"owczarek",2);
        Dog pies3 = new Dog("Puszek",3,"bulldog",10);
        Pair p1 = new Pair();
        Dog[] dogs = new Dog[3];
        dogs[0] = pies1;
        dogs[1] = pies2;
        dogs[2] = pies3;
        findMinMaxAge(dogs,p1);
        System.out.println(p1.toString());
    }
}
