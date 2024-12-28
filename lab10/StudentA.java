import java.util.Comparator;
public class StudentA implements Comparable<StudentA>{
    private String name;
    private double averageGrade;
    private int yearOfStudy;

    public StudentA(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public int compareTo(StudentA other){
        return Comparator.comparingDouble(StudentA::getAverageGrade).reversed().thenComparingInt(StudentA::getYearOfStudy).compare(this,other);
    }

    @Override
    public String toString() {
        return "StudentA{" + "name='" + name + '\'' + ", averageGrade=" + averageGrade + ", yearOfStudy=" + yearOfStudy + '}';
    }
}
