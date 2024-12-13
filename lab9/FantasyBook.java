public class FantasyBook extends Book{
    String fantasySubGenre;
    //konstruktory
    public FantasyBook(){
        super();
        this.fantasySubGenre = "";
    }
    public FantasyBook(String title, String author, String fantasySubGenre) {
        super(title, author);
        this.fantasySubGenre = fantasySubGenre;
    }
    @Override
    public String toString(){
        return super.toString()+", fantasy subgenre="+fantasySubGenre+"}";
    }

}
