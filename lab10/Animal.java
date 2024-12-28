import java.util.Comparator;
public class Animal implements Comparable<Animal> {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other){
        return Comparator.comparingInt(Animal::getAge).thenComparing(Animal::getSpecies).compare(this,other);
    }

    @Override
    public String toString() {
        return "Animal{" + "species='" + species + '\'' + ", age=" + age + '}';
    }
}
