import java.util.Objects;

public final class ImmutableBook {
    private final String title;
    private final String author;
    private final int isbn;
    //konstruktor
    public ImmutableBook(String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    //gettery
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getIsbn(){
        return this.isbn;
    }
    //reszta funkcji
    @Override
    public String toString(){
        return "ImmutableBook{title="+this.title+", author="+this.author+", isbn="+this.isbn+"}";
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        ImmutableBook IB = (ImmutableBook) obj;
        return title.equals(IB.title) && author.equals(IB.author) && isbn==IB.isbn;
    }
    @Override
    public int hashCode(){
        return Objects.hash(title,author,isbn);
    }


}
