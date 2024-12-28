import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 4.5, 2000));
        students.add(new Student("Marek", 3.8, 1999));
        students.add(new Student("Kasia", 4.9, 2001));
        students.add(new Student("Tomek", 4.2, 2002));
        students.add(new Student("Paweł", 3.5, 1998));
        Collections.sort(students);
        for (Student student : students) {
            //System.out.println(student);
        }

        CarC[] cars = new CarC[4];
        cars[0] = new CarC("Toyota", 150000, 2010);
        cars[1] = new CarC("Ford", 120000, 2012);
        cars[2] = new CarC("BMW", 180000, 2008);
        cars[3] = new CarC("Honda", 100000, 2015);
        Arrays.sort(cars);
        for (CarC car : cars) {
            //System.out.println(car);
        }
        StudentA[] studentsA = new StudentA[4];
        studentsA[0] = new StudentA("Janusz",3.4,2);
        studentsA[1] = new StudentA("Krysztof",3.2,4);
        studentsA[2] = new StudentA("Marcin",4.5,1);
        studentsA[3] = new StudentA("Maria",4.0,2);
        Arrays.sort(studentsA);
        for(StudentA student : studentsA){
            //System.out.println(student);
        }

        Order[] orders = new Order[4];
        orders[0] = new Order("ketchup",100,5.2);
        orders[1] = new Order("jaja",200,0.8);
        orders[2] = new Order("mleko",150,2.4);
        orders[3] = new Order("chrupki",50,30);
        Arrays.sort(orders);
        for(Order order : orders){
            //System.out.println(order);
        }

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Łukasz","Kowalczyk","menadżer");
        employees[1] = new Employee("Andrzej","Wiśniewski","dyrektor");
        employees[2] = new Employee("Grzegorz","Waszczyk","dyżurny");
        employees[3] = new Employee("Jan","Olszewski","logistyk");
        Arrays.sort(employees);
        for(Employee employee : employees){
            //System.out.println(employee);
        }

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Cat", 5));
        animalList.add(new Animal("Bird", 2));
        animalList.add(new Animal("Horse", 7));
        animalList.add(new DogA("Dog", 4, "Bulldog"));
        animalList.add(new DogA("Dog", 4, "Beagle"));
        animalList.add(new DogA("Dog", 3, "Labrador"));
        Collections.sort(animalList);
        for (Animal animal : animalList) {
            //System.out.println(animal);
        }


    }
}
