public record Person(int pesel, String firstName, String lastName, int age, Address address) {
    public Person{
        if(age<0){
            age=0;
        }
    }
}
