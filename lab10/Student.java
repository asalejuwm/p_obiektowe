import java.time.LocalDate;
 class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;
    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }
     public String getName() {
         return name;
     }

     public double getAverageGrade() {
         return averageGrade;
     }

     public int getYearOfBirth() {
         return yearOfBirth;
     }

     @Override
     public int compareTo(Student other){
         return Double.compare(other.averageGrade, this.averageGrade);
     }
     @Override
     public String toString() {
         return "Student{name='" + name + '\'' + ", averageGrade=" + averageGrade + ", yearOfBirth=" + yearOfBirth + '}';
     }
}
