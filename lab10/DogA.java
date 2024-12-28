import java.util.Comparator;
public class DogA extends Animal {
    private String breed;
    public DogA(String species, int age, String breed){
        super(species,age);
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }

    @Override
    public int compareTo(Animal other) {
        int animalComparison = super.compareTo(other);
        if (animalComparison != 0 || !(other instanceof DogA)) {
            return animalComparison;
        }
        DogA otherDog = (DogA) other;
        return this.breed.compareTo(otherDog.getBreed());
    }

    @Override
    public String toString() {
        return "DogA{" + "species=" + getSpecies()+ ", age = " + getAge() + ", breed " + getBreed() + "}";
    }
}
