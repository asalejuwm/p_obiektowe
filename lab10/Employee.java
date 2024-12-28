import java.util.Comparator;
public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Employee other){
        return Comparator.comparingInt(e -> ((Employee)e).getLastName().length()).compare(this,other);
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", position='" + position + '\'' + '}';
    }
}
