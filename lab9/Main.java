public class Main {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Lord of The Rings","J.R.R. Tolkien",49.99,1954);
        BookDTO book2 = new BookDTO("Nineteen Eighty-Four","George Orwell", 20.99, 1949);
        BookDTO book3 = new BookDTO("Under the Dome","Stephen King",45.99,2009);
        Address adres1 = new Address("Pudziana", 1,"99-999","Tczew");
        Person person1 = new Person(007,"Mariusz","Pudzian",30,adres1);
        System.out.println(person1.toString());
        Car car1 = new Car("Fiat","Punto", 6.00);
        System.out.println(car1.fuelCost(7.5,500));
        BankAccount acc1 = new BankAccount(55,5);
        BankAccount acc2 = BankAccount.createWithNumber(55);
        Book book4 = new Book("tytul","autor");
        book4.addReview(2.0);
        book4.addReview(3.0);
        System.out.println(book4.toString());
        book4.removeReview(1);
        System.out.println(book4.toString());
        FantasyBook book5 = new FantasyBook("tytul","autor","gatunek");
        System.out.println(book5.toString());

        Engine engine1 = new Engine(100,"type",69);
        CarC carc1 = new CarC(engine1);
        carc1.setMake("Toyota");
        carc1.setModel("Century");
        System.out.println(engine1.toString());
        System.out.println(carc1.toString());

        ImmutableBook IB1 = new ImmutableBook("tytul","autor",500);
        System.out.println(IB1.toString());
    }
}