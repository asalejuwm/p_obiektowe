import java.util.ArrayList;
import java.util.Objects;
public class Book {
    private String title;
    private String author;
    private ArrayList<Double> reviews;
    //konstruktory
    public Book(){
        this.title="";
        this.author="";
        this.reviews = new ArrayList<>();
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.reviews=new ArrayList<>();
    }
    //gettery
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    //settery
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    /*
    public void setReviews(double[] reviews){this.reviews = reviews;}
     */
    public void setReviews(ArrayList<Double> reviews){this.reviews = reviews;}



    //reszta funkcji
    @Override
    public String toString(){
        return "Book{" + "title=" + title + ", author=" + author + ", reviews=" + printReviews() + '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author, reviews);
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||obj.getClass()!=this.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && reviews==book.reviews;
    }

    public String printReviews(){
        String res = "{";
        for(double d : reviews){
            res+=d+", ";
        }
        return res;
    }

    public void addReview(double review){
        this.reviews.add(review);
    }
    public void removeReview(int index){
        this.reviews.remove(index);
    }


/*
    public String printReviews(){
        String res = "{";
        for(int i=0; i<this.reviews.length; i++){
            res+=this.reviews[i]+", ";
        }
        return res;
    }

    public void addReview(double review){
        double[] newReviews = new double[reviews.length+1];
        System.arraycopy(reviews,0, newReviews,0,reviews.length);
        newReviews[reviews.length]=review;
        this.reviews = newReviews;
    }
    public void removeReview(int index){
        if(index<0||index>=reviews.length){
            throw new IndexOutOfBoundsException("Nieprawidlowy indeks");
        }
        double[] newReviews = new double[reviews.length-1];
        System.arraycopy(reviews,0,newReviews,0,index);
        System.arraycopy(reviews,index+1,newReviews,index,reviews.length-index-1);
        this.reviews = newReviews;
    }
    */

}